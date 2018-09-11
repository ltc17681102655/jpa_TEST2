package time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {

    @Test
    public void demo1() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;

        String format = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format);
        //20180715

        DateTimeFormatter yyyy年MM月dd日 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format1 = LocalDate.now().format(yyyy年MM月dd日);
        System.out.println(format1);
        //2018年07月15日

        LocalDate parse = LocalDate.now().parse(format1, yyyy年MM月dd日);
        System.out.println(parse);
        //2018-07-15

    }

    @Test
    public void test5() {
        // 获取预定义的格式，DateTimeFormatter类预定了很多种格式
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        // 获取当前日期时间
        LocalDate now = LocalDate.now();
        // 指定格式化器格式日期时间
        String strNow = now.format(dtf);
        System.out.println(strNow);

        // 自定义格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String strNow2 = now.format(formatter);
        System.out.println(strNow2);

        // 将字符串转换成日期
        LocalDate date = LocalDate.parse(strNow2, formatter);
        System.out.println(date);
    }
}
