package Day11.listdemo;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();

        // 添加元素
        // ArrayList在添加的时候有个特点 不管添加什么， 都会添加成功
        // 所以会有不写返回值
        // boolean result1 = list.add("eeee");
        // System.out.println(result1);
        // 自要调用方法就行
        list.add("aaa");
        list.add("bb");
        list.add("cc");
        // 打印集合
        System.out.println(list);

        // 删除元素
        // 1. 直接删除一个元素 如果删除成功就会返回true 否则false
        boolean remove = list.remove("aaa");
        System.out.println("----------");
        System.out.println(remove);
        // 打印集合
        System.out.println(list);
        // 2. 可以根据索引删除一个元素，索引规则跟数组 字符串规则一样 如果通过索引删除被删除的
        // 元素做一个返回
        System.out.println("-------");
        // 被删除的值做一个返回
        String str = list.remove(0);
        System.out.println(str);
        // 打印集合
        System.out.println(list);

        // 修改元素
        System.out.println("----------");
        list.set(0, "qqq");
        // 打印集合
        System.out.println(list);

        // 查询元素
        System.out.println("--------");
        String result = list.get(0);
        System.out.println(result);
        // 打印集合
        System.out.println(list);

        // 遍历
        System.out.println("-------------------------------");
        for (int i = 0; i < list.size(); i++) {
            // i = 索引
            // list.get(i)才是元素
            String str1 = list.get(i);
            System.out.println(str1);
        }

    }
}
