package com.git.evaluation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/AmaniNasri")
public class AmaniController {


    @GetMapping(value = "/Amani")
    public String AmaniMsg() {
        return "Hello Amani";
    }
    public String AmaniMsg() {
        return "modified same function !!";
    }
    public void SecondCommit(){
        System.Ou.Println ("hello there ! second Commit after change")
         System.Ou.Println ("change branche ameni nasri !")
    }
}

