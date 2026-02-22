package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class DemoApplicationStartApp {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationStartApp.class, args);
	}

}
