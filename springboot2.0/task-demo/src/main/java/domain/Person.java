package domain;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
/**
 * @Auther: ltc
 * @Date: 2018/7/19 14:57
 * @Description:
 */
public class Person implements Serializable {

    @NotNull(message = "用户名不能为空")
    private String name ;

    private Integer age ;

    @NotNull(message = "电话号码不能为空")
    private Integer phone ;

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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
