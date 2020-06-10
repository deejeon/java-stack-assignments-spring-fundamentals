package com.danieljeon.gettingfamiliar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GettingfamiliarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GettingfamiliarApplication.class, args);
	}

}
