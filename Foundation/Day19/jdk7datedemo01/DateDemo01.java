/*  如何创建日期对象

            空参构造
            Date date = new Date();
            带参构造
           Date date = new Date(zhidig)
2. 如何修改瞬间的毫秒值

           setTime(毫秒值)

3. 如何获取时间对象的毫秒值

            getTime();
*/
package Day19.jdk7datedemo01;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        // 创建Date对象
        // 空参构造,表是当前时间
        Date d1 = new Date();
        System.out.println(d1);

        System.out.println("---------------------------------");
        // 表示从时间原点，过了零毫秒的值
        Date d2 = new Date(0L);
        System.out.println(d2);

        System.out.println("---------------------------------");
        // 修改时间
        d2.setTime(1000L);
        System.out.println(d2);

        System.out.println("---------------------------------");
        //获取时间的毫秒值
       Long time =  d2.getTime();
       System.out.println(time);
    }
}
