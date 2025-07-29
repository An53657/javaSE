/*练习 数据操作
创建一个ArrayLiat集合，并添加以下字符串，字符串前面是姓名，后面是年龄
"zhangsan, 23"
"lisi, 24"
"wangwu, 25"
保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值

 */
package Day25.a02streamdemo02.a02testdemo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");

        System.out.println("-------------------匿名内部类输出方式-----------------------------------");
        Map<String, Integer> newMap1 = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(new Function<String, String>() {
                    public String apply(String s) {
                        return s.split(",")[0];
                    };
                }, new Function<String, Integer>() {
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split(",")[1]);
                    };
                }));
        System.out.println("匿名内部类输出方式：" + newMap1);

        System.out.println("-------------------lamabda表达式输出方式-----------------------------------");
        Map<String, Integer> newMap2 = list.stream().filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        System.out.println("lamabda表达式输出方式: " + newMap2);
    }
}