/*Stream终结方法
toarray()                                       收集流中的数据，放到数组当中
collect(collector , collector)                  收集流中的数据，放到集合当中
 */
package Day25.a02streamdemo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan", "wanwu", "lisi");

        // toarray() 收集流中的数据，放到数组当中
        //
        Object[] array1 = list.stream().toArray();
        System.out.println(Arrays.toString(array1));

        // toArray方法参数的详细解读
        // IntFunction的泛型 具体类型的数组
        // apply形参 流中数据个数 要跟数组长度保持一致
        // apply返回值 具体类型的返回值
        // 方法体 就是常见数组

        // toArray方法的参数的作用 负责创建指定类型的数组
        // toArray方法的底层 会依得到流里面的每一个数组，并白数据放到数组中
        // toArray方法的返回值 是一个装流里面所有数据的数组
        String[] arr1 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });

        System.out.println(Arrays.toString(arr1));

        // lamada表达式
        String[] arr2 = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr2));

    }
}
