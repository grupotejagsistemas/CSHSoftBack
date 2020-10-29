package com.tejag.cshsoftware.apirest.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SprintSecurityConfig extends WebSecurityConfigurerAdapter {

	//con la anotación @EnableGlobalMethodSecurity(securedEnabled = true) se habilita la seguridad de endpoints con anotaciones, por defecto es false
	
	@Autowired
	private UserDetailsService usuarioService;

	// La anotación bean nos permite a través de un método el objeto que retorna, en
	// este caso un BCryptPasswordEncoder lo va a registrar en el contenedor de
	// spring para que después se pueda inyectar con autowired y utilizar en
	// cualquier otra clase de configuración
	// o cualquier clase de spring, parecido a lo que hace la anotación componente
	// pero con la diferencia de que component es para anotar una clase que estamos
	// ceando, propia nuestra. Acá es lo mismo pero es un metodo y el objeto que
	// retorna este método lo registra.
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.usuarioService).passwordEncoder(passwordEncoder());
	}

	@Bean("authenticationManager")
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

}
