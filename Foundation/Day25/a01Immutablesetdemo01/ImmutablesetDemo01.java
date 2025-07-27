package Day25.a01Immutablesetdemo01;

import java.util.Iterator;
import java.util.List;

public class ImmutablesetDemo01 {
    public static void main(String[] args) {

        // 创建不可变集合list,
        // 不可变集合一旦创建之后，就不能删除，添加，修改
        // 只能遍历
        List<Integer> list = List.of(114, 2, 3, 5, 7, 8, 9, 5, 6, 4, 6, 8, 9);

        // 获取0索引上的元素
        System.out.println(list.get(0));

        // 修改元素
        // System.out.println(list.remove(2));

        // 添加元素
        // System.out.println(list.add(44));

        // 修改元素
        System.out.println(list.set(0, 11111));

        // 修改元素
        // System.out.println(list.remove(2));

        System.out.println("---------- // 用普通for遍历----------------------");
        // 用普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        System.out.println("---------遍历集合用增强for遍历-----------------------");
        // 遍历集合用增强for遍历
        for (Integer l : list) {
            System.out.print(l);
        }

        System.out.println("------------用迭代器遍历--------------------");
        // 用迭代器遍历
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int number = it.next();
            System.out.print(number);
        }

        System.out.println("--------------------------------");
    }
}
