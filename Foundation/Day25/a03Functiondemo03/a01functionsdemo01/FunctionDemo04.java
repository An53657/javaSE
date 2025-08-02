/*使用类名引用成员方法
    格式:类名::成员方法
    eg:String:substring
    练习 集合里有一些字符串，要求变成大写在输出

这个引用方法的规则
1.需要有函数式接口
2.被引用的方法必须存在
3.被引用的方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
4.被引用的方法的功能需要满足当前的需求

抽象方法的解释
第一个参数：表示被引用方法的调用者，决定可以引用那些类中的方法
            在Stream流中，第一个参数一般表示流里面的每一个数据
            假设流里面的数据是字符串，那么使用这种方式进行方法引用，只能用String这个类中的方法

第二个参数导最后一个参数，跟被引用的方法的形参保持一致，如果没有第二个形参，说明被用于的方法需要是无参的成方法
 */
/*package a01functionsdemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class FunctionDemo04 {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();
        // 用Collections这个方法，批量添加到集合中
        Collections.addAll(list, "aaa", "bbb", "ccc");
        System.out.println("--------------用lambda的匿名内部类书写--------------------------------------------------------");
        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                // 变成大写后输出
                // map(String::toUpperCase)
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("--------------用lambda的引用方法书写--------------------------------------------------------");
        // list.stream().map(String::toUpperCase) ：
        // 拿着流里面的每一个数据，去调用String类中的toUpperCase的方法，方法发返回值就是转换之后的结果
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
        */
