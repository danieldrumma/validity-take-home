package com.validity.controllers;

import com.validity.models.Record;
import com.validity.tools.Analysis;
import com.validity.tools.CSVPrep;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;

@EnableAutoConfiguration
@Controller
public class outController {

    private ArrayList<String> dups = new ArrayList<>();
    private ArrayList<String> non_dups = new ArrayList<>();

    private boolean init_flag = true;

    /**
     * Parse csv, run analysis, and return result
     * uses initial flag to ensure that nothing changes when page is refreshed
     * @param model
     * @return
     * @throws IOException
     */
    @GetMapping("/")
    public String main(Model model) throws IOException {
        if(init_flag){
            CSVPrep prep = new CSVPrep();
            ArrayList<Record> recordList = prep.readFile();

            Analysis analysis = new Analysis();
            analysis.checkDuplicates(recordList);
            setLists(analysis.getDuplicates(), analysis.getNon_duplicates());
            init_flag = false;
        }
        model.addAttribute("dups", dups);
        model.addAttribute("non_dups", non_dups);

        return "index"; //view
    }

    /**
     * helper method to set value of duplicate arraylist and non-duplicate arraylist
     * @param duplicates - set of duplicates, post analysis
     * @param non_duplicates - set of non-duplicates, post analysis
     */
    public void setLists (ArrayList<Record> duplicates, ArrayList<Record> non_duplicates) {
        for(Record r : duplicates){
            dups.add(r.getFull());
        }

        for(Record r : non_duplicates){
           non_dups.add(r.getFull());
        }
    }

}