package com.example.emproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.Data;

@SpringBootApplication(scanBasePackages = "com.example.emproject")
public class EmprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprojectApplication.class, args);
	}

}
