package com.validity.main;

import com.validity.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class ValidityTakeHomeApplication {

	public static void main(String[] args) throws IOException {
		CSVPrep prep = new CSVPrep();
		ArrayList<Record> recordList = prep.readFile();

		Analysis analysis = new Analysis();
		analysis.checkDups(recordList);
		analysis.printLists();


		//SpringApplication.run(TestController.class, args);
	}

}
