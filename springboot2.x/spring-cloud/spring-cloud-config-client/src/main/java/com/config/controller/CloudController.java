package com.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/night")
    public String getName() {

        return foo;
    }
}
