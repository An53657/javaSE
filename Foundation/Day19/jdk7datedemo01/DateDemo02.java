//需求1 打印时间原点开始一年之后的时间
//需求2 定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
package Day19.jdk7datedemo01;

import java.util.Date;
import java.util.Random;

public class DateDemo02 {
    public static void main(String[] args) {
        getTime();

        // 需求2 定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        // 定义Random对象
        Random r = new Random();

        // 创建两个随机时间对象
        // 利用Math abs 方法
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));

        long time1 = d1.getTime();
        long time2 = d2.getTime();
        if (time1 > time2) {
            System.out.println("第一个时间在后面，第二个时间在前面");
        } else if (time1 < time2) {
            System.out.println("第二个时间在后面，第一个时间在前面");
        } else {
            System.out.println("两个时间一样");
        }

    }

    private static void getTime() {
        // 需求1 打印时间原点开始一年之后的时间
        Date d1 = new Date(0L);
        // 获取d1时间的毫秒值
        long time = d1.getTime();
        // 计算一年之后的毫秒值
        time = time + 1000L * 60 * 60 * 24 * 365;

        // 把计算的结果，放回去就可以了
        d1.setTime(time);
        // 打印
        System.out.println(d1);
    }
}
