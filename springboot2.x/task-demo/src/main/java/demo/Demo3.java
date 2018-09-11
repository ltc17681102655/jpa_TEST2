package demo;

import domain.Person;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Demo3 {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        System.out.println(person);
    }


    @Test
    public void demo(){
        Random random = new Random();

        System.out.println(random.nextInt(3) + 1);
    }

    @Test
    public void demo2(){
    }

}
