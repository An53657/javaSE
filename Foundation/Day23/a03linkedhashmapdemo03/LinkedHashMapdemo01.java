package Day23.a03linkedhashmapdemo03;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapdemo01 {
    public static void main(String[] args) {
        // 创建LinkedHashMap双列集合
        Map<String, String> map = new LinkedHashMap<>();

        // 添加元素
        map.put("a", "123");
        map.put("a", "1236");
        map.put("c", "u");

        // 打印集合
        System.out.println(map);
    }
}
