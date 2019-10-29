package com.validity.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVPrep{

    public ArrayList<Record> readFile() throws IOException{
        // open file input stream
        BufferedReader reader = new BufferedReader(new FileReader(
                "C:\\Users\\boait\\Documents\\GitHub\\validity-take-home\\demo\\src\\" +
                        "Validity_take_home_exercise\\advanced.csv"));

        // read file line by line
        String line = null;
        Scanner scanner = null;
        int index = 0;
        ArrayList<Record> recList = new ArrayList<>();
        int ln = 0;
        //skip id too
        reader.readLine();

        while ((line = reader.readLine()) != null) {
            Record newRec = new Record(line.toLowerCase());
            recList.add(newRec);
        }

        //close reader
        reader.close();

        for(Record record : recList){
            System.out.println(record);
        }
        return recList;
    }

}