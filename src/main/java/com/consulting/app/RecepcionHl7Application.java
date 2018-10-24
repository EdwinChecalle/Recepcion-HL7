package com.consulting.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class RecepcionHl7Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RecepcionHl7Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RecepcionHl7Application.class);
	}

}
