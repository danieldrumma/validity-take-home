package com.validity.main;

import com.validity.algs.levAlg;

import java.util.ArrayList;

public class Analysis {
    //add current line
    //non dup and dup set
    //loop through arra
    private ArrayList<Record> duplicates = new ArrayList<>();
    private ArrayList<Record> non_duplicates = new ArrayList<>();
    private boolean found;
    public void checkDups(ArrayList<Record> records) {
        for(int i = records.size() - 1;  i >= 0; i--) {

            Record curr = records.get(i);

            for(int j = i - 1;  j >= 0; j--) {
                Record curr_b = records.get(j);
                if ((levAlg.distance(curr.getFirst_name(), curr_b.getFirst_name()) < 3) &&
                        (levAlg.distance(curr.getLast_name(), curr_b.getLast_name()) < 3)) {
                    duplicates.add(records.get(i));
                    if(!found) {
                        found = true;
                    }

                    records.remove(j);
                }
            }
            if( found) {
                records.remove(i);
                found = false;
            }
        }

        for(Record r : records){
            non_duplicates.add(r);
        }
    }


    public void printLists() {
        System.out.println("duplicates found\n");
        for(Record r : duplicates){
            System.out.println(r.toString() + "\n");
        }
        System.out.println("|||||||||||||||||\n");
        System.out.println("non duplicates found");
        for(Record r : non_duplicates){
            System.out.println(r.toString() + "\n");
        }
    }

    public ArrayList<Record> getDuplicates() {
        return duplicates;
    }

    public ArrayList<Record> getNon_duplicates() {
        return non_duplicates;
    }

}
