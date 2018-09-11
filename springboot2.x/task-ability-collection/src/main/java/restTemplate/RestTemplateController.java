package restTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ltc
 * @Date: 2018/7/14 15:10
 * @Description:
 */
@RestController
public class RestTemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String get() {
        String forObject = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
        return forObject;
    }

    @RequestMapping(value = "/post")
    /**
     * 模拟post请求
     */
    public String getPost() {

        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        HttpEntity<String> formEntity = new HttpEntity<String>("", headers);

        String result = restTemplate.postForObject("http://localhost:8088/actuator/bus-refresh/", formEntity, String.class);
        return result;
    }
}
