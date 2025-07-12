// 带条件的数据爬取
// 有如下文本，请按照要求爬取数据。
// Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长
// 期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
// 需求1：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
// 需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为:Java8Java11Java17Java17
// 需求3：爬取除了版本号为8,11，17的Java文本，
package Day18.a06regexfemo06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo06 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来,经历了很多版本,目前企业中用的最多的是java8和java11,因为这两个是长,期支持版本"
                + "下一个长期支持版本是java17,相信在未来不久Java17也会逐渐登上历史舞台";
        System.out.println("---------------------------------------------");
        System.out.println("需求1");
        // 需求1：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        // 创建正则表达式对象

        // 定义正则表达式
        // ?理解为前面的java数据
        // =表示在java后面要跟随的java数据
        // 但是在获取的时候，只获取前半部
        String regex1 = "((?i)java)(?=8|11|17)";

        // 创建正则表达式和文本阅读器对象
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(str);

        while (m1.find()) {
            System.out.println(m1.group(0));
        }

        System.out.println("---------------------------------------------");
        System.out.println("需求2");
        // 需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为:Java8Java11Java17Java17
        // 获取需求2的正则表达式

        // 一种
        String regex2 = "((?i)java)(8|11|17)";

        // 二种
        String regex3 = "((?i)java)(?:8|11|17|)";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);

        while (m2.find()) {
            System.out.println(m2.group(0));
        }

        System.out.println("---------------------------------------------");
        System.out.println("需求3");
        // 需求3：爬取除了版本号为8,11，17的Java文本，
        String regex4 = "((?i)java)(?!8|11|17)";
        Pattern p3 = Pattern.compile(regex4);
        Matcher m3 = p3.matcher(str);

        while (m3.find()) {
            System.out.println(m3.group(0));
        }
    }
}
