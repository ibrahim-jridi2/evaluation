package com.git.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.git.evaluation.services.AmaniBouhriraService;

@RestController
@RequestMapping(value = "/alternance")
public class AmaniBouhriraController {
    @Autowired
    AmaniBouhriraService AmaniBouhriraService;

    // for all , this class will be touched later .
    @GetMapping(value = "/AmaniBouhrira")
    public String AmaniBouhriraMsg() {
        return AmaniBouhriraMsg.AmaniBouhriraMsg();
    }
    public void SecondCommit(){
        System.Ou.Println ("hello there ! ssecond Commit after change")
    }
}
