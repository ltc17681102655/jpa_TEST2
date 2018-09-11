package demo;

import org.junit.jupiter.api.Test;

public class Demo4 {

    @Test
    public void demo(){
        boolean equals = sort.WEEK.equals(sort.WEEK);
        System.out.println(equals);
    }

}

enum sort{
    WEEK("AA");

    private String name ;

    sort(String name) {
        this.name = name;
    }

}
