package com.example.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import ch.qos.logback.classic.Logger;
//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class FirstProjectApplication extends SpringBootServletInitializer{

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(FirstProjectApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
		LOGGER.info("Main method executed..");
	}
}
