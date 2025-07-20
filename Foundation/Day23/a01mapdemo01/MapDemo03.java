/* 
    利用键找值的方式遍历Map集合，要求 装着键的单列集合使用增强for进行遍历
 */
package Day23.a01mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 获取所有的值，把这些值放到一个单列节
        Set<String> keys = map.keySet();

        // 遍历集合，利用之情for遍历
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + value);
        }

    }
}