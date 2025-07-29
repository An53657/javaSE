
/*Stream流
8. 先得到一条Stream流(流水线)，并把数据放上去
获取方式          方法名                               说明
单列结合          default Stream<E> Stream()           Collection中默认方法
双列结合          无                                   无法直接使用Stream流
数组              public static<T> Stream(T[] array)   Array工具类中的静态方法
一堆零散数据       public static<T> of(T...values)
 */
package Day25.a02streamdemo02.a01streamdemo01;

import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {
        //一堆零散数据       public static<T> of(T...values)
        Stream.of(1,2,3,4,5,6,7).forEach(s -> System.out.println(s));

        Stream.of("zhangsan","lisi","wangwu").forEach(s -> System.out.println(s));
    }
}
