// ChronoUnit:用于计算两个 "日期" 间隔 (所用的)
package Day19.jdk8datedemo02;

 
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

 

public class DateDemo09 {
    public static void main(String[] args) {
        //获取现在的LocalDateTime对象
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //获取指定LocalDateTime对象
        LocalDateTime localDateTime2 = LocalDateTime.of(2025, 7, 14, 8, 00, 00);
        System.out.println(localDateTime2 );

        //相差的年数
        System.out.println( ChronoUnit.YEARS.between(localDateTime,localDateTime2));

        //相差的天数
        System.out.println(ChronoUnit.DAYS.between(localDateTime, localDateTime2));

        ////相差的小时数
        System.out.println(ChronoUnit.HOURS.between(localDateTime, localDateTime2));

      
    }
    
}