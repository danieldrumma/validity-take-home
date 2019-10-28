package com.validity.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVPrep{

    public static void main(String[] args) throws IOException {
        // open file input stream
        BufferedReader reader = new BufferedReader(new FileReader(
                "employees.csv"));

        // read file line by line
        String line = null;
        Scanner scanner = null;
        int index = 0;
        List<String> addList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            String emp = new String();
//            scanner = new Scanner(line);
//            scanner.useDelimiter(",");
//            while (scanner.hasNext()) {
//                String data = scanner.next();
//
//            }
            addList.add(emp);
        }

        //close reader
        reader.close();

        System.out.println(addList);

    }

}