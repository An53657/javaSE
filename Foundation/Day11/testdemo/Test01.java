//需求 定义一个集合 添加字符串 并进行遍历 
//遍历格式[元素1，元素2，元素3]
package Day11.testdemo;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("1");
        list.add("2");

        // 遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            // 如果i== 最大索引 自打印一个元素 获取并打印
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                // 并不是最后一个索引
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
