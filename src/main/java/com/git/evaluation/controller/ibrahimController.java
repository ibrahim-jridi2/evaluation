package com.git.evaluation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.git.evaluation.services.ibrahimService;

@RestController
@RequestMapping(value = "/alternance")
public class ibrahimController {
    @Autowired
    ibrahimService ibrahimService;

    // for all , this class will be touched later .
    @GetMapping(value = "/ibrahim")
    public void ibrahimMsg() {
        ibrahimService.ibrahimMsg();
    }
}
