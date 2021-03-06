package com.tejag.cshsoftware.apirest.auth;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SuppressWarnings("deprecation")
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	// Esta clase se encarga de dar acceso a los clientes a los recursos de nuestra
	// aplicación,
	// siempre y cuando el token que está enviando el cliente en las cabeceras sea
	// un token válido

	// se implementa un solo método, es el que nos permite implementar todas las
	// reglas de seguridad de nuestros endpoint
	// hacia los recursos.
	// Es del lado Oauth

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET, "/api/voluntario").permitAll()
				/*
				 * .antMatchers(HttpMethod.GET, "/api/voluntario/{id}").hasAnyRole("USER",
				 * "ADMIN") .antMatchers(HttpMethod.POST,
				 * "/api/mascotas/upload").hasAnyRole("USER", "ADMIN")
				 * .antMatchers(HttpMethod.POST, "/api/voluntario").hasRole("ADMIN")
				 * .antMatchers("/api/voluntario/**").hasRole("ADMIN")
				 */
				.anyRequest().authenticated().and().cors().configurationSource(corsConfigurationSource());

		// hasRole = 1 solo rol
		// hasAnyRole = + de 1 rol
		// todas las rutas que no especifiquen en este métodos van a ser solo con
		// autenticación independiente el role
		// en el caso de usar la anotación secured se debe establecer cuales endpoints
		// van a ser permitidos por todos en esta clase, el resto de permisos se
		// establece con la anotación desde el controller
	}

	@Bean
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization"));

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
	}

	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter() {
		FilterRegistrationBean bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(corsConfigurationSource()));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);

		return bean;
	}

}
