/*Stream流
8. 先得到一条Stream流(流水线)，并把数据放上去
获取方式          方法名                               说明
单列结合          default Stream<E> Stream()           Collection中默认方法
双列结合          无                                   无法直接使用Stream流
数组              public static<T> Stream(T[] array)   Array工具类中的静态方法
一堆零散数据       public static<T> of(T...values)
 */
package Day25.a02streamdemo02.a01streamdemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo06 {
    public static void main(String[] args) {
        // 获取单列集合
        ArrayList<Integer> list0 = new ArrayList<>();
        // 添加元素
        Collections.addAll(list0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 获取一条流水线，并把集合数据放到流水线上
        Stream<Integer> stream0 = list0.stream();
        // 使用终结方法打印流水线上的数据
        stream0.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                // s 表示流水线上的每一个数据
                System.out.println(s + "1 ");

            }
        });
        System.out.println("===========================");
        // 单列结合 default Stream<E> Stream() Collection中默认方法
        ArrayList<Integer> list = new ArrayList<>();
        // 添加元素
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream().forEach(s -> System.out.print(s + " "));

        System.out.println("--------------------------------------");
        // 双列结合 无 无法直接使用Stream流
        HashMap<Integer, Integer> hs = new HashMap<>();
        // 添加元素
        hs.put(1, 1);
        hs.put(2, 2);
        hs.put(3, 3);
        hs.put(4, 4);
        hs.put(5, 5);
        hs.put(6, 7);
        hs.put(8, 8);
        hs.put(9, 9);
        hs.put(10, 10);
        // 第一种Stream流
        hs.keySet().stream().forEach(s -> System.out.print(s + " "));
        System.out.println("--------------------------------------");
        // 第二种Stream流
        hs.entrySet().stream().forEach(s -> System.out.print(s + " "));

        System.out.println("--------------------------------------");
        // 数组 public static<T> Stream(T[] array) Array工具类中的静态方法
        // 创建基本数据类型的数组
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("--------------------------------------");
        Arrays.stream(arr1).forEach(s -> System.out.print(s + " "));
        // 创建引用数据类型的数组
        System.out.println("--------------------------------------");
        String[] arr2 = { "zhangsan", "wangwu", "lisi" };
        Arrays.stream(arr2).forEach(s -> System.out.print(s + " "));

        // 一堆零散数据 public static<T> of(T...values)
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(s -> System.out.print(s + " "));
        Stream.of("zhangsan", "lisi", "wangwu").forEach(s -> System.out.print(s + " "));

    }
}
