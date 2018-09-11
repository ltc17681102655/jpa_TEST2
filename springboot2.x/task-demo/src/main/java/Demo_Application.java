import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@ComponentScan(basePackages = {"collection"})
@RestController
public class Demo_Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo_Application.class);
    }

    @RequestMapping("/helloword")
    public String get(){

        System.out.println("/hello");
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("YYYY-MM-dd  HH:mm:ss");
        return "aliyun=="+simpleFormatter.format(new Date())+"==hello word" ;

    }
}
