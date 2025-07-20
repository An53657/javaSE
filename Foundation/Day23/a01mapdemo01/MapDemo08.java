package Day23.a01mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo08 {

    public static void main(String[] args) {
        // 创建Map集合
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 用lambda表达式进行遍历
        // foreach方法在底层就是用第二种方式进行遍历，一次得到每一个键和值
        // 在调用
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String vaule) {
                System.out.println(key + vaule);
            }
        });

        System.out.println("---------------------------");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String vaule) {
                System.out.println(key + vaule);
            }
        });

    }
}