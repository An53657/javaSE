/*练习 引用静态方法
集合中有以下数字要求把他们变成int类型
"1", "2" "3" , "4", "5"
 */
/*package a01functionsdemo01;

import java.util.ArrayList;
import java.util.Collections;

public class FunctionDemo01 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        // 常规方法
        ArrayList<Integer> newlist = new ArrayList<>();
        for (String s : list) {
            int n = Integer.parseInt(s);
            newlist.add(n);
        }
        System.out.println(newlist);

        // lambda表达式的匿名内部类书写
        list.stream().map(new java.util.function.Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int n = Integer.parseInt(s);
                return n;
            }
        }).forEach(s -> System.out.println(s));
        // 用方法引用书写
        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s + "1"));

    }
}
*/