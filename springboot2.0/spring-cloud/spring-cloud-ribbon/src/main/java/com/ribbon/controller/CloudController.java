package com.ribbon.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CloudController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon")
    /**
     * eureka-client-one i am from port:===8081
     * eureka-client-one i am from port:===8082
     */
    @HystrixCommand(fallbackMethod = "helloword")
    //name=get-client-name
    public String getName(String name) {

        String forObject = restTemplate.getForObject("http://eureka-client-one/" + name, String.class);

        return forObject;
    }


    public String helloword(String name) {
        return "service stop == error";
    }

}
