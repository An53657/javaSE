package Day25.a02streamdemo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo08 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五", "张岱", "张文武", "张文远", "12", "12", "李四");
        Collections.addAll(list2, "张梁");

        System.out.println("-------------------------------------");
        // static <T> Stream<T> concat(Stream a , Stream b) 合并a和b两个流为一个流
        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println());
    }
}
