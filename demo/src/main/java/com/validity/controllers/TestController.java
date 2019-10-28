package com.validity.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@EnableAutoConfiguration
public class TestController {

    @RequestMapping("/index")
    public ModelAndView firstPage() {
        System.out.println("running\n");
        return new ModelAndView("index.html");
    }

}
