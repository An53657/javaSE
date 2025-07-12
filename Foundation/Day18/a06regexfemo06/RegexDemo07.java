/* 贪婪爬取和非贪婪爬取
有如下文本，请按照要求爬取数据。
Java自从95年问世以来，abbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaa
经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长
期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
需求1：按照ab+的方式爬取ab b尽可能多的获取
需求2：按照ab+的方式爬取ab b尽可能少的获取
*/

/*只写+和*表示贪婪匹配
         +? 非贪婪匹配
         *? 非贪婪匹配

         贪婪爬取：在爬取数据的时候尽可能多的获取
         非贪婪爬取：在爬取数据的时候尽可能少的获取

         在java中，默认的就是贪婪爬取
         如果在数量词+ * 后面加上？ 那么此时是非贪婪爬取
 */
package Day18.a06regexfemo06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo07 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来,经历了很多版本,abbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaaaaaaa," +
                "目前企业中用的最多的是java8和java11,因为这两个是长,期支持版本"
                + "下一个长期支持版本是java17,相信在未来不久Java17也会逐渐登上历史舞台";

        System.out.println("---------------------------------------------");
        System.out.println("需求1");
        // 需求1：按照ab+的方式爬取ab b尽可能多的获取
        String regex1 = "ab+";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(str);

        while (m1.find()) {
            System.out.println(m1.group(0));
        }

        System.out.println("---------------------------------------------");
        System.out.println("需求2");
        // 需求2：按照ab+的方式爬取ab b尽可能少的获取
        String regex2 = "ab+?";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);

        while (m2.find()) {
            System.out.println(m2.group(0));
        }
    }
}
