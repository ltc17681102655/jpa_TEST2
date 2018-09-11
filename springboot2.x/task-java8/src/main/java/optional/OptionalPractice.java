package optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalPractice {

    @Test
    public void demo1() {
        Optional<Integer> integer = Optional.of(456);
        System.out.println(integer);

//        不能存null
//        Optional<Integer> ofNUll = Optional.of(null);
//        System.out.println(ofNUll);

        //解决
        Optional<Integer> ofNullable = Optional.ofNullable(null);
        System.out.println(ofNullable);

        Optional<Object> empty = ofNullable.empty();
        System.out.println(empty);

    }
    @Test
    public void demo2() {
        Object aaa = Optional.empty().orElse("aaa");
        System.out.println(aaa);

        Object bbb = Optional.empty().orElse(null);
        System.out.println(bbb);

    }

    @Test
    public void demo3() {
    User user = null ;

        String s = Optional.ofNullable(user).map(User::getName).orElse(null);
        System.out.println(s);


    }
}
