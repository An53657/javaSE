//双列集合第一种遍历方式
//通过键找值
package Day23.a01mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        // 创建双列集合
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 获取所有的键，把这些键放到一个单列集合中
        Set<String> keys = map.keySet();

        // 利用增强for遍历单列结合
        for (String key : keys) {
            //key表示一次得到的每一个键
            // 利用Map集合中的键获取对应的值
            String value = map.get(key);
            System.out.println(key + " " + value);
        }
    }
}
