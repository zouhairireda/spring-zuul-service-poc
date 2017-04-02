package com.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableAutoConfiguration(exclude = { SecurityAutoConfiguration.class })
public class BookApplication {

	@RequestMapping("/available")
	public String available() {
		return "Spring in Action";
	}

	@RequestMapping("/checkout-out")
	public String checkedOut() {
		return "Spring Boot in Action !";
	}

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}
}
