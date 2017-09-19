package com.github.kahux.config;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * Config spring security for web.
 *
 * @author  kahux
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	private final Logger logger = Logger.getLogger(getClass());

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		logger.debug("Using custom configure(HttpSecurity http) to config access resources");

		String[] matcher = new String[]{"/", "/index"};
		http.cors()
				.disable()
			.authorizeRequests()
				.antMatchers(matcher)
				.permitAll()
				.anyRequest()
				.authenticated()
				.and()
			.formLogin()
				.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/")
				.and()
			.httpBasic();
	}

	@Bean
	@Override
	protected UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("user").password("admin").roles("USER").build());
		return manager;
	}
}
