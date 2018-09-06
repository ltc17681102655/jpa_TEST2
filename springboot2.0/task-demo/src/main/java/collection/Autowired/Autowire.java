package collection.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class Autowire {

    @Autowired
    List<UserService> list;

    @Autowired
    Set<UserService> set;

    @Autowired
    Map<String, UserService> map;

    @Autowired
    @Qualifier("userService1")
    UserService userService;


    @RequestMapping("/")
    public void get() {
        userService.sys();
        System.out.println("=============");
        map.get("userService2").sys();
        System.out.println("=============");
        list.stream().forEach(c->c.sys());
        System.out.println("=============");
        set.stream().forEach(c->c.sys());
    }

    @RequestMapping("/hell")
    public void hell() {
        System.out.println("ok");
    }

    public static void main(String[] args) {
        System.out.println(15*12);
    }
}
