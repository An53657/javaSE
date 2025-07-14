/*
Duration:用于计算两个 "时间" 间隔 (秒，纳秒)
2. Period  :用于计算两个 "日期" 间隔 (年月日)
3. ChronoUnit:用于计算两个 "日期" 间隔 (所用的)
   
 */
package Day19.jdk8datedemo02;

import java.time.Duration;
import java.time.LocalTime;

public class DateDemo07 {
    public static void main(String[] args) {
        // 2. Period :用于计算两个 "日期" 间隔 (年月日)
        // 获取现在的localDate对象
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);
        System.out.println("------------------------------------");

        // 第一个获取指定LocalTime对象
        LocalTime localTime2 = LocalTime.of(10, 20, 20);
        System.out.println(localTime2);
        System.out.println("------------------------------------");

        // 第二个获取指定LocalTime对象
        LocalTime localTime3 = LocalTime.of(5, 20, 20);
        System.out.println(localTime3);
        System.out.println("------------------------------------");

        // Duration:用于计算两个 "时间" 间隔 (秒，纳秒)
        // 定一个参数减第二个参数
        Duration duration1 = Duration.between(localTime1, localTime2);
        System.out.println(duration1);
        System.out.println("------------------------------------");

        // 时间转换
        // 两个时间差的天数
        System.out.println(duration1.toDays());
        // 两个时间差的小时数
        System.out.println(duration1.toHours());
        // 两个时间差的分钟数
        System.out.println(duration1.toMinutes());
        System.out.println("------------------------------------");

        

    }

}
