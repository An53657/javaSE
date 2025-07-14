//日历相关
package Day19.jdk8datedemo02;

import java.time.LocalTime;
 

public class DateDemo05 {
    public static void main(String[] args) {
        // 获取现在的日历对象
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        // 获取指定的日历对象
        LocalTime localTime2 = LocalTime.of(8, 20, 20);
        System.out.println(localTime2);

        // get方法获取日历对象的每一个属性
        // 获取小时
        int time1 = localTime1.getHour();
        System.out.println(time1);

        // 获取分钟
        int time2 = localTime1.getMinute();
        System.out.println(time2);
        System.out.println("--------------------------------------------");

        // isXXX判断时间前后
        boolean localDateTime2 = localTime1.isBefore(localTime2);
        System.out.println(localDateTime2);
        System.out.println("--------------------------------------------");

        // with开头的 修改时间
        LocalTime localDateTime3 = localTime2.withHour(2);
        System.out.println(localDateTime3);
        System.out.println("--------------------------------------------");

        // 增加时间或减少时间
        LocalTime localTim2 = localTime2.minusHours(8);
        System.out.println(localTim2);

        LocalTime i = localTime2.plusHours(9);
        System.out.println(i);

    }
}
