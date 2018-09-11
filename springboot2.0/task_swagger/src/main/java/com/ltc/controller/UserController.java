package com.ltc.controller;

import com.ltc.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class UserController {

    @ApiOperation(value = "展示首页信息", notes = "展示首页信息")
    @GetMapping("/show")
    public Object showInfo() {
        return "hello world";
    }

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息")
    @ApiImplicitParam(name = "user", value = "User", required = true, dataType = "User")
    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user) {
        return "success";
    }
}
