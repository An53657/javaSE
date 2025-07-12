/*有如下文本，请按照要求爬取数据。
Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是ava8和，
lava11因为这两个是长期支持版本，下一个长期支持版本是lava17相信在未来不久ava17也会逐渐登上历史舞台
要求：找出里面所有的Javaxx
*/
package Day18.a06regexfemo06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo03 {
    public static void main(String[] args) {
        // 本地爬取
        String str = "java自从95年问世以来,经历了很多版本,目前企业中用的最多的是java8和" +
                "java11因为这两个是长期支持版本,下一个长期支持版本是java17相信在未来不久java17也会逐渐登上历史舞台";
        System.out.println(str);
        // Pattern 正则表达式的意思，相当于获取正则表达式的对象
        // Matcher 文本匹配器，作用按照正则表达式的规则去取字符串从头开始读取
        // 在大串中读取字符串(读取str)

        // 1. 获取正则表达式对象
        Pattern p = Pattern.compile("java\\d{0,2}");

        // 2. 获取文本匹配器对象
        // m:文本匹配器对象
        // str:大串
        // p:规则
        // m要在str中找到符合p规则的小串
        Matcher m = p.matcher(str);

        // 3. 拿着文本匹配器从头开始读取，寻找是否有满足规则的字符串
        // 如果没有方法返回false
        // 如果有返回true，在底层记录字符串起始索引和结束索引+1
        // 04
        boolean b = m.find();
        System.out.println(b);

        // 4. 方法底层会根据find的方法记录的索引进行字符串的截取
        // subString(起始索引，结束索引)
        String s1 = m.group();
        System.out.println(s1);

        // 第二次调用final方法的时候，会继续截取后面的内容
        // 读取的第二个满足要求的子串，方法会继续肺结核false
        // 并把第二个子串起始索引和结束索引+1，进行记录

        b = m.find();

        String s2 = m.group();
        System.out.println(s2);

        // //循环判断
        // while (b = m.find()) {
        // System.out.println(m.group());
        // }
    }
}
