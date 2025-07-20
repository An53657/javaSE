//Map集合第二种遍历方式
package Day23.mapdemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo06 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");

        Set<Map.Entry<String, String>> entyries = map.entrySet();
        for (Map.Entry<String, String> enty : entyries) {
            String keys = enty.getKey();
            String values = enty.getValue();
            System.out.println(keys + values);

        }

    }
}
