//Map集合第二种遍历方式
package Day23.mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo06 {
    public static void main(String[] args) {
        // 创建双列集合Map
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 通过键值对进行遍历
        // 通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entyries = map.entrySet();
        // 遍历entyrise这个集合，得到每一个键值对对象
        for (Map.Entry<String, String> enty : entyries) {
            // 利用enty调用方法获取键值对
            String keys = enty.getKey();
            String values = enty.getValue();
            System.out.println(keys + values);

        }

    }
}
