//详细说明请看3，本地爬取
package Day18.a06regexfemo06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo04 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来,经历了很多版本,目前企业中用的最多的是java8和" +
                "java11因为这两个是长期支持版本,下一个长期支持版本是java17相信在未来不久java18也会逐渐登上历史舞台";
        // 创建正则表达式和文本匹配器对象
        Pattern p = Pattern.compile("java\\d{0,2}");
        // 拿着m去读str,找符合p规则的子串
        Matcher m = p.matcher(str);

        //
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }

    }
}
