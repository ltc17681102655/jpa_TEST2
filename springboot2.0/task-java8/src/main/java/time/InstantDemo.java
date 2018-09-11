package time;

import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantDemo {

    @Test
    public void demo1() {
        Instant now = Instant.now();
        System.out.println(now);

        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        long l = now.toEpochMilli();
        System.out.println(l);

        long l1 = System.currentTimeMillis();
        System.out.println(l1);

        /**
         * 2018-07-15T09:35:07.472Z
         * 2018-07-15T17:35:07.472+08:00
         * 1531647307472
         * 1531647307496
         */
    }

    @Test
    public void test1() {
        // 获取当前时间的时间戳
        Instant instant = Instant.now();
        // 因为中国在东八区，所以这句输出的时间跟我的电脑时间是不同的
        System.out.println(instant);

        // 既然中国在东八区，则要偏移8个小时，这样子获取到的时间才是自己电脑的时间
        OffsetDateTime dateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(dateTime);

        // 转换成毫秒，如果是当前时间的时间戳，结果跟System.currentTimeMillis()是一样的
        long milli = instant.toEpochMilli();
        System.out.println(milli);
    }

}
