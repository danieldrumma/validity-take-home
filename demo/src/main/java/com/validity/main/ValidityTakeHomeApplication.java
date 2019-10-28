package com.validity.main;

import com.validity.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidityTakeHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestController.class, args);
	}

}
