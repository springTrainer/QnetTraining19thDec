package com.qnet.sleuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SleuthController {

    Logger logger= LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String helloSleuth(){
        logger.info("Hello Sleuth");
        return "success";
    }
    
    @GetMapping("/sleuthServiceCall")
    public String sleuthServiceCall(){
        logger.info("Inside the method sleuthServiceCall of service 1");
        template.getForEntity("http://localhost:9093/sleuthService",String.class);
        return "success";
    }
}
