package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Value("${server.port}")
    private String port ;

    @RequestMapping("/get-client-name")
    public String getName(){
        return "eureka-client-one  "+" i am from port:==="+port;
    }
}
