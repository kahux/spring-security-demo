package com.github.kahux.oauth.server.config;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 * Config spring security for web.
 *
 * @author kahux
 */
@Configuration
@EnableWebSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

  private final Logger logger = Logger.getLogger(getClass());

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    logger.debug("Using custom configure(HttpSecurity http) to config access resources");

    http
        .authorizeRequests()
          .anyRequest()
          .authenticated()
          .and()
        .csrf()
          .disable()
        .formLogin()
          .and()
        .httpBasic();
  }

}
