/*Stream终结方法
toarray()                                       收集流中的数据，放到数组当中
collect(collector , collector)                  收集流中的数据，放到集合当中
 */
package Day25.a02streamdemo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo10 {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        Collections.addAll(list, "XXX1-男-24", "XXX2-女-25", "XXX3-男-29",
                "XXX4-女-28", "XXX5-女-30", "XXX6-男-27", "XXX7-女-20", "XXX8-男-35", "XXX9-男-40", "XXX10-女-38",
                "XXX11-男-39", "XXX12-男-42");

        System.out.println("--------------------------List集合 lamabds表达式------------------------------------------");

        // List集合 lamabds表达式
        List<String> newList = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println("List输出打印结果: " + newList);

        System.out.println("--------------------------Set集合 lamabda表达式------------------------------------------");

        // Set集合 lamabda表达式
        Set<String> newset = list.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println("set输出打印结果: " + newset);

        System.out.println("--------------------------Map匿名内部类输出打印------------------------------------------");

        // Map集合
        Map<String, Integer> newMap1 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                /*
                 * 参数详解
                 * toMap：参数一表示键的生成规则
                 * 参数二表示值的生成规则
                 * 
                 * 参数一：
                 * Function泛型一: 表示流中的每一个数据类型
                 * 泛型二：表示Map集合的数据类型
                 * 
                 * 方法apply： 依次表示流里面的每一个数据
                 * 方法体： 生成键的代码·
                 * 返回值： 已经生成键的代码
                 * 参数一：
                 * Function泛型一: 表示流中的每一个数据类型
                 * 泛型二：表示Map集合的数据类型
                 * 
                 * 方法apply： 依次表示流里面的每一个数据
                 * 方法体： 生成值的代码·
                 * 返回值： 已经生成值的代码
                 * 
                 * 
                 */
                .collect(Collectors.toMap(new Function<String, String>() {
                    public String apply(String s) {
                        return s.split("-")[0];
                    };

                }, new Function<String, Integer>() {
                    public Integer apply(String s) {
                        return Integer.parseInt(s.split("-")[2]);
                    };
                }));

        System.out.println("Map匿名内部类输出打印: " + newMap1);

        System.out.println("--------------------------lamada表达式输出打印------------------------------------------");

        Map<String, Integer> newMap2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println("lamada表达式输出打印: " + newMap2);
        System.out.println("---------------------------------------------------------------------------------------");

    }
}
