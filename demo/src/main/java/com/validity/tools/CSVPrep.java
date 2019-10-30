package com.validity.tools;

import com.validity.models.Record;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVPrep{

    public ArrayList<Record> readFile() throws IOException{

        String filePath = new File("").getAbsolutePath();
        BufferedReader reader = new BufferedReader(new FileReader(filePath+"\\data\\normal.csv"));

        // read file line by line
        String line;
        int index = 0;
        ArrayList<Record> recList = new ArrayList<>();
        int ln = 0;
        //skip column label row
        reader.readLine();
        while ((line = reader.readLine()) != null) {
            Record newRec = new Record(line);
            recList.add(newRec);
        }

        //close reader
        reader.close();
        return recList;
    }

}