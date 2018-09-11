package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import web.domain.User;
import web.service.UserService;

import java.time.Duration;

@RestController
public class WebFluxController {

    @Autowired
    private UserService userService;

    @GetMapping("webFlux_mono")
    public Mono<String> first() {
        return Mono.justOrEmpty("hello ,word");
    }

    /**
     * 功能描述：根据id找用户
     *
     * @param id
     * @return
     */
    @GetMapping("find")
    public Mono<User> findByid(final String id) {
        return userService.getById(id);
    }


    /**
     * 功能描述：删除用户
     *
     * @param id
     * @return
     */
    @GetMapping("del")
    public Mono<User> del(final String id) {
        return userService.del(id);
    }

    /**
     * 功能描述：列表
     *
     * @return
     */
    @GetMapping(value = "list_delay", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> list() {
        return userService.list().delayElements(Duration.ofSeconds(2));
    }

    /**
     * 功能描述：列表
     *
     * @return
     */
    @GetMapping(value = "list_all", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> list_all() {
        return userService.list();
    }

    /**
     * 功能描述：列表
     *
     * @return
     */
    @GetMapping(value = "list_delay2", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<User> list_delay2() {
        return userService.list().delayElements(Duration.ofSeconds(2));
    }
}
