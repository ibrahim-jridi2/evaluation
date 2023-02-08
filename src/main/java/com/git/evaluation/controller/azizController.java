package com.git.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.git.evaluation.services.azizm;

@RestController
@RequestMapping(value = "/alternance")
public class azizmController {
    @Autowired
    azizmService azizmService;

    // for all , this class will be touched later .
    @GetMapping(value = "/azizm")
    public String azizmMsg() {
        return azizmService.azizmMsg();
    }
}
