package com.vanilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vanilla")
public class VanillaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VanillaApplication.class, args);

	}

}
