/*
    练习利用set集合添加字符串，并使用多种方法
    迭代器遍历
    增强for遍历
    lambda表达式遍历
 */
package Day22.a02setdemo02.a04otherdemo04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo01 {
    public static void main(String[] args) {
        // 创建Set集合并添加字符串
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");

        for (String s : set) {
            System.out.println(s);
        }

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        set.forEach(s -> System.out.println(s));
        set.forEach(s -> System.out.println(s));

    }

}
