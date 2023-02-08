package com.git.evaluation.controller;

import com.git.evaluation.services.HachemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alternance")
public class hachemController {

    @Autowired
    HachemService hachemServ;


    @GetMapping(value = "/hachem")
    public String HechService() {
        return hachemServ.HechService();
    }


}
