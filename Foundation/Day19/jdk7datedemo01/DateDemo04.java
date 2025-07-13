/* 
方法名                                   说明
public f Date getTime()                  获取日历对象
public final setTime(Date date)          给日历设置对象
public long getTimeInMillis()            拿到时间毫秒值
public void setTimeInMillis(long millis) 给日历设置毫秒值
public int get(int field)                取日历中的某个字段名
public void set(int field,int value)     修改日历的某个字段名信       
public void add(int field,int amount)    为某个字段名曾加或减少指定信息
*/
package Day19.jdk7datedemo01;

import java.util.Calendar;
import java.util.Date;

public class DateDemo04 {
    public static void main(String[] args) {
        // 获取日历对象
        // 细节1 Caleder是一个抽象类，不能直接new,而是通过静态方法获取到子类对象
        // 底层原理
        // 会根据系统的不同时区来获取不同的日历对象，默认表示当前时间
        // 会把时间中的纪元、年、月、日、时、分、秒、星期等放到一个数组中
        // 细节2
        // 月份范围0~11 如果获取是0 那么实际上是一月
        // 1（星期日）以此类推
        Calendar c = Calendar.getInstance();
        // System.out.println(c);

        // public final setTime(Date date) 给日历设置对象
        Date d1 = new Date(0L);
        c.setTime(d1);
        // System.out.println(c);

        // public void set(int field,int value) 修改日历的某个字段名信
        c.set(Calendar.YEAR, 2000);

        // public void add(int field,int amount) 为某个字段名曾加或减少指定信息
        c.add(Calendar.YEAR, 12);

        // public int get(int field) 取日历中的某个字段名
        // 细节
        // java在底层Calendar，把索引对应的数字定义了常量
        int yes = c.get(Calendar.YEAR);
        int mooun = c.get(Calendar.MONTH);
        System.out.println(yes);
        System.out.println(mooun);

    }
}
