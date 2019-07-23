package com.github.kawakitan.csvchart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(final String[] args) {
		final SpringApplication application = new SpringApplication(Application.class);
		@SuppressWarnings("unused")
		final ApplicationContext context = application.run(args);
	}
}
