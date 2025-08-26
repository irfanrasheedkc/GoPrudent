package com.irfan.goprudent;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoprudentApplication {

	public static void main(String[] args) {
		// Load the .env file before the Spring application starts
		Dotenv dotenv = Dotenv.load();

		// Set system properties for each key-value pair in the .env file
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue()));
		SpringApplication.run(GoprudentApplication.class, args);
	}

}
