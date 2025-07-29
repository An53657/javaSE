/*Stream流的中间方式
名称                    说明
Stream<T> filter(Predicate<? super T> predicate)   过滤
Stream<T> limit(long maxSize)                      获取前几个元素
Stream<T> skip (long n)                            跳过前几个元素
Stream<T> disinct()                                元素去重，(依赖hashCode,equals方法)
static <T> Stream<T> concat(Stream a , Stream b)   合并a和b两个流为一个流
Stream<R> map(Function<T,R> mapper)                转换类型
注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据
 */
package Day25.a02streamdemo02.a01streamdemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "张岱", "张文武", "张文远", "12", "12", "李四");
        Collections.addAll(list2, "张梁");

        // tream<T> filter(Predicate<? super T> predicate) 过滤
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        System.out.println("--------------过滤-----------------------");

        // Stream<T> limit(long maxSize) 获取前几个元素
        System.out.println("------------获取前几个元素-------------------------");
        list.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("------------跳过几个元素-------------------------");
        // Stream<T> skip (long n) 跳过前几个元素
        list.stream().skip(5).forEach(s -> System.out.println(s));

        System.out.println("-------------元素去重------------------------");
        // Stream<T> disinct() 元素去重，(依赖hashCode,equals方法)
        list.stream().distinct().forEach(s -> System.out.println(s));

        System.out.println("--------------合并a和b两个流为一个流-----------------------");
        // static <T> Stream<T> concat(Stream a , Stream b) 合并a和b两个流为一个流
        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println(s));

        System.out.println("-------------转换类型-----------------------");
        // Stream<R> map(Function<T,R> mapper) 转换类型
    }
}
