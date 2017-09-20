package com.github.kahux.oauth.server;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CustomOauthServerApplication {

  /**
   * Application entry.
   *
   * @param args  command line parameters
   */
  public static void main(String[] args) {
    new SpringApplicationBuilder(CustomOauthServerApplication.class)
        .bannerMode(Mode.OFF)
        .web(true)
        .run(args);
  }

}
