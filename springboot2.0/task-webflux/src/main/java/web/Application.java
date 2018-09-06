package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * 新版本兼容问题待解决
 */
public class Application {

    /**
     * Netty started on port(s): 8084
     *
     * @param args
     */
    public static void main(String[] args) {
//        String defaultReactiveWebContextClass = SpringApplication.DEFAULT_REACTIVE_WEB_CONTEXT_CLASS;
//        SpringApplication.run(Application.class, defaultReactiveWebContextClass);
        SpringApplication.run(Application.class, args);
    }
}
