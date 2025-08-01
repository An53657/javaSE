/*练习 引用构造方法
集合里面存储姓名和年龄，比如XXX1,28
要求：将数据封装成Stundent对象并收集到list集合中

数据：
男演员："XX1,25" "XX2,24" "XX3,35" "X4,27" "X5,39" "XX6,31" 

方法引用原则
    1. 需要有函数式接口
    2. 本引用的方法必须已经存在
    3. 被引用的方法的形参和返回值，需要跟抽象方法的返回值保持一致
    4. 被引用的方法的功能需要满足当前的需求
 */
package Day25.a03Functiondemo03.Functiondemo01;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "XX1,25", "XX2,24", "XX3,35", "X4,27", "X5,39", "XX6,31");

        System.out.println("--------------用lambda的匿名内部类书--------------------------------------------------------");
        // 用匿名内部类书写
        List<Stundent> newList = list.stream().map(new Function<String, Stundent>() {
            @Override
            public Stundent apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Stundent(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println("用lambda的匿名内部类书: " + newList);

        // 用方法名书写
        System.out.println("---------------用方法名书写-------------------------------------------------------");
        List<Stundent> newList3 = list.stream().map(Stundent::new).collect(Collectors.toList());
        System.out.println("用方法引用书写: " + newList3);
    }
}
