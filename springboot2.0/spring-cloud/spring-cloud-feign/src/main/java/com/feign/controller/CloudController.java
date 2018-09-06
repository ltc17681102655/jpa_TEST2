package com.feign.controller;

import com.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @Autowired
    private FeignService feignService ;

    @RequestMapping("/feign")
    /**
     * eureka-client-one i am from port:===8081
     * eureka-client-one i am from port:===8082
     */
    public String getName() {

        String s = feignService.get();
        return s;
    }
}
