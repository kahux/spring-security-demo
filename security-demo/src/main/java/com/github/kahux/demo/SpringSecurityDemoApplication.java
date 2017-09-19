package com.github.kahux.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringSecurityDemoApplication {

  /**
   * Application entry.
   *
   * @param args  command line parameters
   */
  public static void main(String[] args) {
    new SpringApplicationBuilder(SpringSecurityDemoApplication.class)
        .bannerMode(Banner.Mode.OFF)
        .web(true)
        .run(args);
  }
}
