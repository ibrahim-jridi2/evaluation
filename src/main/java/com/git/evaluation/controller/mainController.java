package com.git.evaluation.controller;

import com.git.evaluation.services.HachemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/esprit")
public class mainController {
    @Autowired
    HachemService hech;

    // for all , this class will be touched later .
    //for all : in this main controller we gonna try to use others service in our own controller.
    // for exp: i'm gonna write a method called public void ibrahimMsg() and into it i will call hachem service
    @GetMapping
    public String IbrahimMsgFromHachemService(){
        return hech.HechService();

    }

}
