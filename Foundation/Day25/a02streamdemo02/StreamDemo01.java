/*体验Stream流的作用
创建集合添加元素，完成以下需求
1.把所有以“张”开头的元素存储到新集合中
2.把“张”开头的，长度为三的元素存储到新集合中
3.遍历打印最终结果
 */
package Day25.a02streamdemo02;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        // 创建List集合
        ArrayList<String> list1 = new ArrayList<>();

        // 添加元素
        list1.add("张三");
        list1.add("李四");
        list1.add("王五");
        list1.add("张岱");
        list1.add("张文武");
        list1.add("张文远");

        // 用stream流书写
        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));

        // 1.把所有以“张”开头的元素存储到新集合中

        // 创建新的集合
        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.startsWith("张")) {
                list2.add(name);
            }

        }
        // 2.把“张”开头的，长度为三的元素存储到新集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if (name.length() == 3) {
                list3.add(name);
            }

        }
        // 3.遍历打印最终结果
        for (String name : list3) {
            System.out.println(name);
        }
    }
}
