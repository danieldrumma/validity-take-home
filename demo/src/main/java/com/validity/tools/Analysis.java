package com.validity.tools;

import com.validity.models.Record;
import org.apache.commons.codec.language.Metaphone;

import java.util.ArrayList;

public class Analysis {
    //add current line
    //non dup and dup set
    //loop through arra
    private ArrayList<Record> duplicates = new ArrayList<>();

    private ArrayList<Record> non_duplicates = new ArrayList<>();

    private boolean found = false;

    /**
     * Check levenchstein distance between first and last names
     * loops over each record and compares to all other records for any duplicate
     * todo: add Metaphone check to ensure duplicate in more robust manner
     * @param records
     */
    public void checkDuplicates(ArrayList<Record> records) {
        //looping backwards in both for loops due to deletion occurring during inner loop iteration
        for(int i = records.size() - 1;  i >= 0; i--) {

            Record curr = records.get(i);

            for(int j = i - 1;  j >= 0; j--) {
                Record curr_b = records.get(j);

                if ((levAlg.distance(curr.getFirst_name(), curr_b.getFirst_name()) < 3) &&
                        (levAlg.distance(curr.getLast_name(), curr_b.getLast_name()) < 3)) {
                    //add current record to set of duplicates
                    duplicates.add(curr);

                    //flag check
                    if(!found) {
                        found = true;
                    }
                    //remove found duplicate from record list
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

    /**
     * Check for metaphone equality across all fields within record
     * @param main record being checked against all other records
     * @param potential record currently being compared to main
     * @return boolean - true when metaphone of two strings are equal, false when not equal
     */
    public boolean checkMetaphone(Record main, Record potential) {
        String[] mainf = main.getFields();

        Metaphone mcheck = new Metaphone();
        String[] potentialf = potential.getFields();
        for(int i = 0; i < mainf.length; i++){
            for(int j = 0; j < potentialf.length; j++){
               boolean isGood =  mcheck.isMetaphoneEqual(mainf[i], potentialf[j]);
               if(!isGood && mainf[i] != null && potentialf[i] != null) {
                   return isGood;
               }
            }
        }
        return true;
    }


    /**
     * helper method to print all duplicates and print all non-duplicates
     */
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
