package time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/**
 * @Auther: ltc
 * @Date: 2018/7/15 17:15
 * @Description: Java8特性之新的日期时间 API
 */

/**
 * https://blog.csdn.net/timheath/article/details/71326329
 *
 *
 * Java 8 提供的日期时间 API都在java.time包下，这个包涵盖了所有处理日期(date)，时间(time)，日期/时间(datetime)，
 * 时区（zone)， 时刻（instant），间隔（duration）与时钟（clock）的操作，可以说一包在手，天下我有。
 *
 */
public class DateTime {
    @Test
    public void demo1() {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime minusDays = now.minusDays(5);
        System.out.println(minusDays);

        LocalDateTime plusDays = now.plusDays(5);
        System.out.println(plusDays);

        int year = now.getYear();
        System.out.println(year);

        LocalDateTime ofTime = LocalDateTime.of(1994, 8, 30, 8, 8);
        System.out.println(ofTime);


    }

    @Test
    public void test() {
        // 获取当前日期时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 将当前日期时间减去两天
        LocalDateTime dateTime2 = now.minusDays(2);
        System.out.println(dateTime2);

        // 将当前日期时间加上五天
        LocalDateTime dateTime3 = now.plusDays(5);
        System.out.println(dateTime3);

        // 输出当前日期时间的年份
        System.out.println(now.getYear());

        // 构造一个指定日期时间的对象
        LocalDateTime dateTime = LocalDateTime.of(2016, 10, 23, 8, 20);
        System.out.println(dateTime);
    }


}
