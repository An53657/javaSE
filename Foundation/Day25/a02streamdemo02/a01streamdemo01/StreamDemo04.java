/*Stream流
8. 先得到一条Stream流(流水线)，并把数据放上去
获取方式          方法名                               说明
单列结合          default Stream<E> Stream()           Collection中默认方法
双列结合          无                                   无法直接使用Stream流
数组              public static<T> Stream(T[] array)   Array工具类中的静态方法
一堆零散数据       public static<T> of(T...values)
 */
package Day25.a02streamdemo02.a01streamdemo01;

import java.util.Arrays;

public class StreamDemo04 {
    public static void main(String[] args) {
        // 数组 public static<T> Stream(T[] array) Array工具类中的静态方法
        // 创建基本数据类型的数组
        int[] arr1 = { 1, 2, 3 };
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        // 创建引用数据类型的数组
        String[] arr2 = { "zhangsan", "wangwu", "lisi" };
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }
}
