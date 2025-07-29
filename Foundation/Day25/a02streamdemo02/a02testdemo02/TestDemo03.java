/*练习 数据操作现在有两个ArrayList集合
第一个集合中：存储六名男演员名字和年龄，
第二个集合中：存储六名女演员名字和年龄
姓名和年龄中间用逗号隔开，比如 张三，23
要求完成以下的操作：
1. 男演员只要名字为3个字的前两人
2. 女演员只要性杨的，并且不要第一个
3. 把过滤后的男演员和女演员姓名合并到一起
4. 将上一步的演员信息封装成Actor对象
5.将所有的原有信息都保存到List集合中
备注：演员Actor,属性有name,age

男演员："XX1,25" "XX2,24" "XX3,35" "X4,27" "X5,39" "XX6,31" 
女演员："XX1,26" "杨2,27" "XX3,32" "X4,37" "X5,33" "杨6,36" 
 */
package Day25.a02streamdemo02.a02testdemo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestDemo03 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();

        // 添加元素
        Collections.addAll(manList, "XX1,25", "XX2,24", "XX3,35", "X4,27", "X5,39", "XX6,31");
        Collections.addAll(womenList, "XX1,26", "杨2,27", "XX3,32", "X4,37", "X5,33", "杨6,36");

        // 1.男演员只要名字为3个字的前两人
        Stream<String> stream1 = manList.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        // 2. 女演员只要性杨的，并且不要第一个
        Stream<String> stream2 = womenList.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);
        // 3. 把过滤后的男演员和女演员姓名合并到一起
        List<Actor> list = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).collect(Collectors.toList());

        System.out.println(list);

    }
}
