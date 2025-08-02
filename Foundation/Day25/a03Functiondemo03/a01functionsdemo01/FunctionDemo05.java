/*引用数组的构造方法
格式：数据类型[] :: new
eg:int[] :: new 

练习 集合中有一些整数 收集到数组中

 */
/*package a01functionsdemo01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class FunctionDemo05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4);
        System.out.println("--------------用lambda的匿名内部类书写--------------------------------------------------------");
        Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------用lambda的引用方法书写--------------------------------------------------------");
        Integer[] arr1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr1));

    }
}
*/