//需求 定义一个集合 添加数字 并进行遍历 
//遍历格式[元素1，元素2，元素3]
package Day11.test;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        // 基本数据类型对应的包装类
        // byte --> Byte
        // short --> Short
        // char --> Character
        // int --> Integer
        // long --> Long
        // float --> Float
        // double --->Double
        // boolean --> Boolean
        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();
        // 添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // 遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");

    }
}