package com.javaspringbootrestapi.jsbra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JsbraApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsbraApplication.class, args);
	}
}
