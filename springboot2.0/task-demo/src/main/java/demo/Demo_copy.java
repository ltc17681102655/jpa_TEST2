package demo;

import domain.CopyUser;
import domain.User;
import org.junit.jupiter.api.Test;
import utils.ConvertUtils;
import utils.EncryptUtil;

import java.util.ArrayList;
import java.util.List;

public class Demo_copy {

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user = new User();
        user.setName("zhangsan");
        user.setId(1l);
        users.add(user);

        User user2 = new User();
        user2.setName("lisi");
        user2.setId(2l);
        users.add(user);

        List<CopyUser> copyUsers = ConvertUtils.convertList(users, CopyUser.class);
        System.out.println(copyUsers);

    }

    @Test
    public void demo(){
        String s = EncryptUtil.md5Hex("578519083");
        System.out.println(s);

        String s1 = EncryptUtil.sha256Hex("578519083");
        System.out.println(s1);
    }
}
