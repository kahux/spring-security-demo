package com.github.kahux.oauth.server.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.security.oauth2.authserver.AuthorizationServerProperties;
import org.springframework.boot.autoconfigure.security.oauth2.authserver.OAuth2AuthorizationServerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.security.oauth2.provider.token.AccessTokenConverter;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthenticationServerConfiguration extends OAuth2AuthorizationServerConfiguration {

  public AuthenticationServerConfiguration(
      BaseClientDetails details,
      AuthenticationManager authenticationManager,
      ObjectProvider<TokenStore> tokenStore,
      ObjectProvider<AccessTokenConverter> tokenConverter,
      AuthorizationServerProperties properties) {
    super(details, authenticationManager, tokenStore, tokenConverter, properties);
  }

  @Override
  public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
    security.allowFormAuthenticationForClients();
    super.configure(security);
  }
}
