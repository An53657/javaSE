/*
 方法名                     说明
static Instant now()       获取当前时间的Instant对象(标准时间)
static Instant ofXXX(long epochMilli)  根据(秒 毫秒 纳秒)获取Imstant对象
ZoneDateTime atZone(ZoneId zone)        指定时区
boolean isXXX(Instant otherInstant)     判断系列的方法
Instart miusXxx(long millisToSubtract)  减少时间系列的方法
Instart PlusXxx(long millisToSubtract)  曾加时间系列的方法
 */
package Day19.jdk8datedemo02;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDemo02 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        // 获取当前时间的Instant对象(标准时间)
        Instant instant1 = Instant.now();
        System.out.println(instant1);

        // 根据(秒 毫秒 纳秒)获取Imstant对象,不带时区的
        // 毫秒值
        Instant instant2 = Instant.ofEpochMilli(1L);
        System.out.println(instant2);

        // 秒钟
        Instant instant3 = Instant.ofEpochSecond(1L);
        System.out.println(instant3);

        // 纳秒
        Instant instant4 = Instant.ofEpochSecond(6, 567800000);
        System.out.println(instant4);

        System.out.println("---------------------------------------");

        // 获取指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Egypt"));
        System.out.println(time);

        System.out.println("---------------------------------------");

        // boolean isXXX(Instant otherInstant) 判断系列的方法
        Instant instant5 = Instant.ofEpochSecond(10);
        Instant instant6 = Instant.ofEpochSecond(20);

        // 当前的调用者(in4)就是在in5前面的 在不在前面 如果在返回true 不在返回false
        // 用于时间的判断
        // isBefore 判断调用者代表时间是否在参数表示时间的前面
        boolean result = instant5.isBefore(instant6);
        System.out.println(result);

        // isAfter 判断调用者代表时间是否在参数表示时间的后面
        boolean result2 = instant5.isAfter(instant6);
        System.out.println(result2);

        System.out.println("---------------------------------------");
        Instant instant7 = Instant.ofEpochSecond(20);
        System.out.println(instant7);

        Instant result3 = instant7.minusSeconds(10);
        System.out.println(result3);
        System.out.println("---------------------------------------");

    }
}
