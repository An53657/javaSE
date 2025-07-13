/* 
static ZonedDateTime now()                获取当前时间的ZonedDateTime对象
static ZoneDateTime offxxx()               获取指定时间的ZonedDateTime对象
ZonedDateTime withXxx(时间)                 修改时间系列的方法
ZonedDateTime minusXxx(时间)                减少时间系列的方法
ZonedDateTime plusXxx(时间)                 增加时间系列的方法
 */
package Day19.jdk8datedemo02;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateDemo03 {
    public static void main(String[] args) {
        // 获取当前时间的ZonedDateTime对象
        ZonedDateTime ZonedDateTime1 = ZonedDateTime.now();
        System.out.println(ZonedDateTime1);

        System.out.println("---------------------------------------");
        // static ZoneDateTime offxxx()
        // 获取指定时间的ZonedDateTime对象 带时区

        ZonedDateTime time = ZonedDateTime.of(2025, 7, 13, 20, 57,
                20, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        System.out.println("---------------------------------------");

        // ZonedDateTime withXxx(时间) 修改时间系列的方法
        ZonedDateTime time2 = time.withYear(2025);
        System.out.println(time2);

        System.out.println("---------------------------------------");
        // ZonedDateTime minusXxx(时间)
        // 减少时间系列的方法
        ZonedDateTime time3 = time2.minusYears(5);
        System.out.println(time3);

        System.out.println("---------------------------------------");
        // ZonedDateTime plusXxx(时间)
        // 增加时间系列的方法
        ZonedDateTime time4 = time3.plusYears(5);
        System.out.println(time4);

    }
}
