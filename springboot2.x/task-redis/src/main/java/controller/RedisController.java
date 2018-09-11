package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    //    1、注入模板
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping(value = "add")
    public Object add() {

        //opsForValue : Returns the operations performed on simple values (or Strings in Redis terminology).

        stringRedisTemplate.opsForValue().set("name", "xdclass2018");
        stringRedisTemplate.opsForValue().set("ltc", "20180705");

        return "add_success";

    }

    @GetMapping(value = "get")
    public Object get() {

        String value = stringRedisTemplate.opsForValue().get("name");
        String value2 = stringRedisTemplate.opsForValue().get("ltc");
        return value + value2;
    }

}
