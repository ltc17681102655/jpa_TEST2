package time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class Duration {

    @Test
    public void demo1() {

        LocalDate last = LocalDate.of(1994, 8, 30);

        LocalDate now = LocalDate.now();

        Period between = Period.between(last, now);
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        /**
         * 注意月份导致的问题
         * 23
         * 10
         * 15
         */

    }
}
