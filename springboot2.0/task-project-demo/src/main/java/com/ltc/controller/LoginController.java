package com.ltc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping(value = "user-login")
public class LoginController {

    @GetMapping("/index")
    public Object index() {
        return "index";
    }

}
