/*构造方法                                                    说明
  public SimpleDateFormat()                                  构造一个SimpleDateFormat，使用默认格式
  public SimpleDateFormat(String pattern)                   构造一个SimpleDateFormat，使用指定 格式

   方法名                                                     说明
   public final String format(Date ,date)                     格式化(日期 字符串)
   public Date prse(String sourse)                            解析(字符串 日期)
 */

package Day19.jdk7datedemo01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo03 {
    public static void main(String[] args) {
        getStr2();

        // public Date prse(String sourse) 解析(字符串 日期)

        // 创建字符串
        String str = "2025-7-13 13.07";
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy-mm-dd HH:mm");
        System.out.println(str);
        System.out.println(sd1);
        

    }

    private static void getStr2() {
        // public SimpleDateFormat() 构造一个SimpleDateFormat，使用默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        // 获取Date
        Date d1 = new Date(0l);
        // 格式化
        String str = sdf.format(d1);
        System.out.println(str);

        // public SimpleDateFormat(String pattern) 构造一个SimpleDateFormat，使用指定 格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyy年mm月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);
    }
}
