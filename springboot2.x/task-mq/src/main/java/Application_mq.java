import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"config", "controller", "provider", "consume", "domain"})
public class Application_mq {

    public static void main(String[] args) {
        SpringApplication.run(Application_mq.class, args);
    }
}
