/* 
    利用键找值的方式遍历Map集合，要求 装着键的单列集合使用迭代器进行遍历
 */
package Day23.a01mapdemo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo04 {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String, String> map = new HashMap<>();

        // 添加元素
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        // 获取所有的键，把这些键放到一个单列结合中
        Set<String> keys = map.keySet();

        // 利用迭代器遍历
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String Key = it.next();
            String vule = map.get(Key);

            System.out.println(keys + vule);

        }
    }
}
