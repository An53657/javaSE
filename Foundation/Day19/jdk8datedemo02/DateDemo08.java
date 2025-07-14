//Period  :用于计算两个 "日期" 间隔 (年月日)
package Day19.jdk8datedemo02;

import java.time.LocalDate;

public class DateDemo08 {
    public static void main(String[] args) {
        LocalDate localTime1 = LocalDate.now();
        System.out.println(localTime1);
        // 获取指定LocaalDate对象
        LocalDate localDate2 = LocalDate.of(2025, 7, 10);
        System.out.println(localDate2);
        System.out.println("------------------------------------");

    }
}
