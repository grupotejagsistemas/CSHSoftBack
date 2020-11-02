package com.tejag.cshsoftware.apirest.models.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tejag.cshsoftware.apirest.models.dao.UsuarioDAO;
import com.tejag.cshsoftware.apirest.models.entity.Usuario;
import com.tejag.cshsoftware.apirest.models.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService, UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);

	@Autowired
	private UsuarioDAO usuarioDao;

//	@Autowired
//	private BCryptPasswordEncoder encoder;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioDao.findByUsername(username);
		if (usuario == null) {
			logger.error("Error en el login: no existe el usuario '" + username + "' en el sistema.");
			throw new UsernameNotFoundException(
					"Error en el login: no existe el usuario '" + username + "' en el sistema.");
		}

		List<GrantedAuthority> authorities = usuario.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority())).collect(Collectors.toList());

		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true,
				authorities);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}

	@Override
	@Transactional
	public Usuario create(Usuario usuario) throws Exception {
		if (usuario.getPassword().contains("1") == true || usuario.getPassword().contains("2") == true
				|| usuario.getPassword().contains("3") == true || usuario.getPassword().contains("4") == true
				|| usuario.getPassword().contains("5") == true || usuario.getPassword().contains("6") == true
				|| usuario.getPassword().contains("7") == true || usuario.getPassword().contains("8") == true
				|| usuario.getPassword().contains("9") == true && usuario.getPassword().contains("[a-zA-Z]+") == true) {

			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String password = usuario.getPassword();
			String p = passwordEncoder.encode(password);
			usuario.setPassword(p);
			if (this.findByUsername(usuario.getUsername()) == null) {
				return usuarioDao.save(usuario);
			} else {
				throw new Exception("El nombre de usuario ya existe.");
			}
		} else {
			throw new Exception("La contraseña debe contener letras y al menos un número.");
		}

	}

	public Usuario validarUsername(String username) {
		Usuario usuario = usuarioDao.findByUsername(username);
		return usuario;
	}

	@Override
	@Transactional
	public Usuario changePassword(String username, String newPass, String oldPass) throws Exception {
		Usuario usuario = usuarioDao.findByUsername(username);
		if (usuario != null && newPass.contains("1") == true || newPass.contains("2") == true
				|| newPass.contains("3") == true || newPass.contains("4") == true || newPass.contains("5") == true
				|| newPass.contains("6") == true || newPass.contains("7") == true || newPass.contains("8") == true
				|| newPass.contains("9") == true && newPass.contains("[a-zA-Z]+") == true) {
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String password = usuario.getPassword();
			if (passwordEncoder.matches(oldPass, password) == true) {
				usuario.setPassword(newPass);
				return usuarioDao.save(usuario);
			} else {
				throw new Exception("La contraseña actual no coincide.");
			}

		} else if (usuario == null) {
			logger.info(username.concat(" no existe."));
			throw new Exception("Error al modificar la contraseña.");
		} else
			throw new Exception("Error al modificar la contraseña.");
	}
}
