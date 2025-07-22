/* 
 collections常用方法

 方法名称                                                                说明
 public static <T> boolean addAll(Collections<T> c,    T ...elments)     批量添加元素
 public static void shuffle(List<?> List)                                打乱List集合元素的顺序
 public static <T> void sort(List<T> List)                              排序
 public static <T> void sort(List<T> List Comparator<T> c)              根据指定规则进行排序
 public static <T> int binarySerach (List <T> List,T key)                以二分查找法查找元素
 public static <T> void copy (List <T> dest, List <T> src)               拷贝集合中的元素
 public static <T> int fill (List <T> List,T obj)                        使用指定元素填充集合
 public static <T> void max/min(Collections<T> coll)                     根据默认的自然排序获取最大值/最小值
 public static <T> voud swap(List <?> List, int i, int j)                交换集合中指定位置的元素
---
 */
package Day24.a02collectionsdemo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ConectionsDemo01 {
    public static void main(String[] args) {
        System.out.println("---------批量添加元素---------------------------");
        // 创建List单列集合
        ArrayList<Integer> list = new ArrayList<>();

        // public static <T> boolean addAll(Collections<T> c, T ...elments) 批量添加元素
        Collections.addAll(list, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 11);
        System.out.println(list);

        System.out.println("---------打乱List集合元素的顺序---------------------------");
        // public static void shuffle(List<?> List) 打乱List集合元素的顺序
        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("---------按照默认规则进行排序---------------------------");
        // public static <T> void sort(List<T> List) 排序
        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------根据指定规则进行排序---------------------------");
        // public static <T> void sort(List<T> List Comparator<T> c) 根据指定规则进行排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2 - 01;
            }
        });
        System.out.println(list);

    }
}
