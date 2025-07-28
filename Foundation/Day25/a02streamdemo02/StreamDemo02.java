/*Stream流
8. 先得到一条Stream流(流水线)，并把数据放上去
获取方式          方法名                               说明
单列结合          default Stream<E> Stream()           Collection中默认方法
双列结合          无                                   无法直接使用Stream流
数组              public static<T> Stream(T[] array)   Array工具类中的静态方法
一堆零散数据       public static<T> of(T...values)

 */
package Day25.a02streamdemo02;

import java.util.ArrayList;

public class StreamDemo02 {
    public static void main(String[] args) {
        // 单列结合 default Stream<E> Stream() Collection中默认方法
        ArrayList<Integer> list = new ArrayList<>();

        // 添加元素
        list.add(1);
        list.add(2);
        list.add(3);

        list.stream().forEach(s -> System.out.println(s));
        
    }
}
