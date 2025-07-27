package Day25.a01Immutablesetdemo01;

import java.util.Iterator;
import java.util.Set;

public class ImmutablesetDemo02 {
    public static void main(String[] args) {
        // 创建不可变的set集合
        Set<Integer> set = Set.of(114, 2, 3, 5, 7, 8, 9);

        // 添加
        // set.add(444);

        // 删除
        // System.out.println(set.remove(7));

        // 用增强for遍历set集合
        System.out.println("-----------------用增强for遍历set集合--------------------------");
        for (Integer s : set) {
            System.out.println(s);
        }

        // 用迭代器遍历
        System.out.println("----------------用迭代器遍历--------------------------");

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
