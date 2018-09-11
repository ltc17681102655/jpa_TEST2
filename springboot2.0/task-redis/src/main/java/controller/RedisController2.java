package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.RedisClient;

@RestController
public class RedisController2 {

    @Autowired
    private RedisClient redisClient;

    @GetMapping(value = "setValue")
    public Object set() {
        return redisClient.set("redis_util", "20180705");
    }

    @GetMapping(value = "getValue")
    public Object get() {
        return redisClient.get("redis_util");
    }

}
