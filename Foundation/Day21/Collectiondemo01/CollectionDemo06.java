/*
    list集合五种遍历方式
    迭代器遍历
    列表迭代器编列
    增强for遍历
    lambda表达式遍历
    普通for遍历(因为lisy集合存在索引)
 */
package Day21.Collectiondemo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionDemo06 {

    public static void main(String[] args) {
        // 创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("mmm");
        list.add("www");

        // 迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("------------------------");
        // 增强for遍历
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("------------------------");
        // 普通for遍历(因为lisy集合存在索引)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // lambda表达式遍历
        System.out.println("------------------------");
        list.forEach(s -> System.out.println(s));
        System.out.println("------------------------");

        // 列表迭代器编列
        // 获取一个迭代器对象，里面指针默认指向0索引处
        // 列表迭代器额外新增了一个方法，在遍历都过程中可以添加元素
        ListIterator<String> lt = list.listIterator();
        while (lt.hasNext()) {
            String result = lt.next();
            if ("aaaa".equals(result)) {
                lt.add("oo");
            }
            System.out.println(result);

        }
    }
}