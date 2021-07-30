package com.example.demologback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class logBackController {


   Logger log = LoggerFactory.getLogger(logBackController.class);

    @RequestMapping("")
    public  String index(){
        log.trace("This is TRACE");
        log.debug("This is DEBUG");
        log.info("This is INFO");
        log.warn("This is WARN");
        log.error("This is ERROR");

        return "welcome to logback";
    }


}
