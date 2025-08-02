/*练习 引用成员方法
需求：
集合有一些名字按照要求过滤数据
数据 "张三","李四","王五","张岱","张文武","张文远"
只要以张开头的，并且名字是三个字的
 */
/*package a01functionsdemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class FunctionDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "张岱", "张文武", "张文远");

        System.out.println("----------------------------------------------------------------------");
        // 用lambda书写
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3)
                .forEach(s -> System.out.println("用lambda: " + s));

        System.out.println("----------------------------------------------------------------------");
        // 用匿名内部类书写
        list.stream().filter(new Predicate<String>() {
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            };
        }).forEach(s -> System.out.println("用lambda的匿名内部类书: " + s));

        // 用方法名书写
        System.out.println("----------------------------------------------------------------------");
         list.stream().filter(new StringOperation() :: StringJude).forEach(s ->System.out.println("用方法引用书写" +s));
 
    }
}
*/