package com.git.evaluation.controller;

import com.git.evaluation.services.ibrahimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alternance")



public class Amani {

    @GetMapping(value = "/Amani")
    public String AmaniMsg() {
        return "Hello Amani";
    }
}
