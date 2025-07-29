/*Stream终结方法
名称                                            说明
void forEach(counsumer action)                  遍历
long count()                                    统计
toarray()                                       收集流中的数据，放到数组当中
collect(collector , collector)                  收集流中的数据，放到集合当中
 */
package Day25.a02streamdemo02.a01streamdemo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class StreamDemo08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("---------------------------------------------------------");
        // lambda表达式
        // void forEach(counsumer action) 遍历
        list.stream().forEach(s -> System.out.println(s));

        // Consumer<Integer>() 表示流中的数据
        // accept(Integer s)方法的形参s 表示依次表示流里面的每一个数据
        // 方法体 对每一个数据处理的操作(打印)

        // 匿名内部类
        list.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s);
            }
        });

        System.out.println("---------------------------------------------------------");
        // long count() 统计
        long s = list.stream().count();
        System.out.println(s);

    }
}
