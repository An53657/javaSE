/*Stream流
8. 先得到一条Stream流(流水线)，并把数据放上去
获取方式          方法名                               说明
单列结合          default Stream<E> Stream()           Collection中默认方法
双列结合          无                                   无法直接使用Stream流
数组              public static<T> Stream(T[] array)   Array工具类中的静态方法
一堆零散数据       public static<T> of(T...values)
 */
package Day25.a02streamdemo02.a01streamdemo01;

import java.util.HashMap;

public class StreamDemo03 {
    public static void main(String[] args) {
        // 双列结合 无 无法直接使用Stream流
        HashMap<Integer, Integer> hs = new HashMap<>();

        // 添加元素
        hs.put(1, 1);
        hs.put(2, 2);
        hs.put(3, 3);
        hs.put(4, 4);

        // 第一种获取Stream流
        hs.keySet().stream().forEach(s -> System.out.println(s));
        // 第二种获取Stream流
        hs.entrySet().stream().forEach(s -> System.out.println(s));
    }
}
