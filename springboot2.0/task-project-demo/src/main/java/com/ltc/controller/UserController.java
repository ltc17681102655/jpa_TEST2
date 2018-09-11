package com.ltc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-center")
public class UserController {

    @RequestMapping("validate")
    public String demo() {

        return "validate--success";
    }
}
