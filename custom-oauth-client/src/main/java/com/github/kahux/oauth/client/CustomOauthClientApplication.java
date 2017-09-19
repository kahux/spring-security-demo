package com.github.kahux.oauth.client;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableOAuth2Sso
@SpringBootApplication
public class CustomOauthClientApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(CustomOauthClientApplication.class)
        .bannerMode(Mode.OFF)
        .web(true)
        .run(args);
  }
}
