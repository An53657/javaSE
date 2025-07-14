package Day19.jdk8datedemo02;

import java.time.LocalDateTime;

public class DateDemo06 {
    public static void main(String[] args) {
        // localDateTime
        // 获取年月日 时分秒 纳秒
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        // 获取指定时间
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, 12, 23, 10, 11, 50);
        System.out.println(localDateTime2);

        // 用get方法获取字段属性
        int time2 = localDateTime2.getHour();
        System.out.println(time2);
        System.out.println("--------------------------------------------");

        // 增加或减少时间
        LocalDateTime time3 = localDateTime2.minusHours(2);
        System.out.println(time3);

        System.out.println("--------------------------------------------");

        LocalDateTime time4 = localDateTime2.plusHours(5);
        System.out.println(time4);
    }
}
