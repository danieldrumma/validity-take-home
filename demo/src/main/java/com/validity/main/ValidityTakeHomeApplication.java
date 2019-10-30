package com.validity.main;

import com.validity.controllers.outController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Daniel Boaitey
 * Validity Take Home Assessment
 */
@SpringBootApplication
public class ValidityTakeHomeApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(outController.class, args);
	}

}
