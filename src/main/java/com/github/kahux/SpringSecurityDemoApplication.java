package com.github.kahux;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringSecurityDemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(SpringSecurityDemoApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.web(true)
				.run(args);
	}
}
