//需求 定义一个集合 添加字符，并进行遍历 
//遍历格式[元素1，元素2，元素3]
package Day11.test;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Character> list = new ArrayList<>();

        // 添加字符
        list.add('我');
        list.add('的');
        list.add('世');
        list.add('界');
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
