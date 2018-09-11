package controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SpringMvcController {

    private Map<String, Object> map = new HashMap<>();

    @RequestMapping(path = "test")
    public String test() {

        return "test_success";
    }

    @RequestMapping(path = "getPath/{name}/{age}")
    public String getPath(@PathVariable String name, @PathVariable Integer age) {

        return name + "====" + age;
    }

    @RequestMapping(path = "getRequestParam")
    public String getRequestParam(@RequestParam(defaultValue = "ltc", required = false, name = "author") String name, Integer age) {

        return name + "====" + age;
    }

    @RequestMapping("getRequestBody")
    public Map<String, Object> getResponseBody(@RequestBody(required = false) User user) {

        if (user != null) {
            map.clear();
            map.put("age", user.getAge());
            map.put("name", user.getName());
        }

        return map;
    }

    @RequestMapping("getHeader")
    public String getHeader(@RequestHeader(required = false, name = "accessToken") String token) {

        return token;
    }

    @RequestMapping("getRequstServlet")
    public String getRequstServlet(HttpServletRequest request) {
        String id = request.getParameter("id");
        return id;
    }

    @RequestMapping("test_jackson")
    public User getJackson(HttpServletRequest request) {
        User user = new User();
        user.setAge(null);
        user.setName("ltc");
        user.setPassword(11223344);
        user.setCreateTime(new Date());
        return user;
    }


}

class User implements Serializable {
    @JsonProperty("it_dev_name")
    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer age;

    @JsonIgnore
    private Integer password;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password=" + password +
                '}';
    }
}
