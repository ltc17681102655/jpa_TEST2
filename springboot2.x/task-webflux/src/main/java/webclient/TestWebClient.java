package webclient;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class TestWebClient {

    @Test
    public void test1() {
        Mono<String> stringMono = WebClient.create().get().uri("http://localhost:8084/find?id=1")
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);

        System.out.println(stringMono.block());
    }

    @Test
    public void test2() {
        Mono<String> stringMono = WebClient.create().get().uri("http://localhost:8084/find?id={id}", 2)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);

        System.out.println(stringMono.block());
    }

    @Test
    public void test3() {
        Mono<String> stringMono = WebClient.create().get().uri("http://localhost:8084/find?id={id}", 2)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class);

        System.out.println(stringMono);
    }
}
