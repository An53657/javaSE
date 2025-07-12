/*需求：把下面文本中的电话，邮箱，手机号，热线都爬取出来。
来黑马程序员学习Java，
电话:18512516758，18512508907
或者联系邮箱：boniu@itcast.cn,
座机电话：01036517895，010-98951256
邮箱：bozai@itcast.cn,
热线电话：400-618-9090,400-618-4000，4006184000,4006189090package Day18.a06regexfemo06;
*/
package Day18.a06regexfemo06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo05 {
    public static void main(String[] args) {
        // 手机号正则表达式：1[3-9]\d{9}
        // 邮箱正则表达式：\w=@[\w&&[^_]]{2,6}(\.[a-zA-z]{2,3}){1,2}
        // 座机号正则表达式：0\d{2,3}-?[1-9]\d{4,9}
        // 热线电话正则表达式：400-?[1-9]\d{2}-?[1-9]\d{3}

        String str = "来黑马程序员学习Java:" + 
                "电话:18512516758:18512508907" +  
                "或者联系邮箱:boniu@itcast.cn," +  
                "座机电话:01036517895,010-98951256" +  
                "邮箱:bozai@itcast.cn," + 
                "热线电话,400-618-9090,400-618-4000,4006184000,4006189090package ";
        // 只要满足其中一个就行
        String regex = "(1[3-9]\\d{9})|(\\w=@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2})|(0\\d{2,3}-?[1-9]\\d{4,9})|(400-?[1-9]\\d{2}-?[1-9]\\d{3})|";

        // 获取正则表达式和文本阅读器的对象
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        // 循环
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
        
    }
}
