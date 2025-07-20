//利用键找值的方式遍历Map集合，要求 装着键的单列集合使用Lambad表达式进行遍历
package Day23.mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo05 {

    public static void main(String[] args) {
        // 创建双列Map
        Map<String, String> map = new HashMap<>();

        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 获取Map一个值，并放在 一个单列集合里
        Set<String> keys = map.keySet();

        // 用增强for遍历，遍历单列集合获取每一个值
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + value);
        }

    }
}