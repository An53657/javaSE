/*  TreeMap基本应用
需求：
键：整数表示id
值：字符串：表示商品名称
要求1 ：按照id升序排列
要求2 ： 按照id降序排列
 */
package Day23.a04treemapdemo04.treemapdemo01;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        // 要求1 ：按照id升序排列
        // 创建treemap集合
        Map<Integer, String> map1 = new TreeMap<>();
        // Integer Double 默认情况下都是按照升序排列的
        // String 按照字母在ASCLL码表中对应数字升序进行排列

        // 添加元素
        map1.put(1, "可口可乐");
        map1.put(2, "哇哈哈");
        map1.put(3, "六个核桃");
        map1.put(4, "伊利");

        // 打印
        System.out.println(map1);

        System.out.println("---------------------------------");
        // 要求2: 按照id降序排列
        // 创建treemap集合
        Map<Integer, String> map2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1:当前添加的元素
                // o2：表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });

        // 添加元素
        map2.put(1, "可口可乐");
        map2.put(2, "哇哈哈");
        map2.put(3, "六个核桃");
        map2.put(4, "伊利");

        // 打印
        System.out.println(map2);

    }
}
