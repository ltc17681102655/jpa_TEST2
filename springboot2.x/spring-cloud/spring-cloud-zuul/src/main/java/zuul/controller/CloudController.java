package zuul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudController {

    @RequestMapping("/")
    public String getName(){
        return "eureka-client-one  "+" i am from port:===";
    }
}
