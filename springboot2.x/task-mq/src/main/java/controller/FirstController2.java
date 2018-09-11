package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.Sender;

@RestController
public class FirstController2 {

    @Autowired
    private Sender sender;

    @RequestMapping("hello")
    public String get() {
        sender.send();
        return "hello_word";
    }
}
