//用键找值和键值对的方式遍历集合
package Day23.a01mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo07 {
    public static void main(String[] args) {
        // 创建Map双列集合
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 第一种方式遍历 键找值
        Set<String> keys = map.keySet();
        // 用增强for进行遍历
        for (String key : keys) {
            String values = map.get(key);
            System.out.println(key + values);
        }

        // 第二种遍历 用键值对对象
        Set<Map.Entry<String, String>> entrrise = map.entrySet();

        // 用增强for遍历
        for (Map.Entry<String, String> entry : entrrise) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + value);

        }

    }
}
