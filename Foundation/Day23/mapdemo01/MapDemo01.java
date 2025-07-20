/*
  Map常见API
 方法名                               说明
v put (K key, V valie)              添加元素
V remove(Object Key)                根据键删除键值对元素
void Clear()                        移除所有的键值对元素
boolean containsKey(Object Key)     判断集合是否包括指定的键
boolean containsValue(Object Value) 判断是否包括指定的值
boolean isEmpty()                   判断集合是否为空
int size()                          集合的长度，也就是集合中键值队的个数

 */
package Day23.mapdemo01;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        // 创建双列集合Map
        Map<String, String> map = new HashMap<>();

        // 添加元素
        // put添加方法的细节
        // 添加/覆盖
        // 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null
        // 在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回
        map.put("百事可乐", "3.5元");
        map.put("番茄薯片", "4.5元");
        map.put("芬达", "3.0元");
        String value = map.put("芬达", "2.0元");
        System.out.println(value);

        System.out.println("------------------------------------------------------");
        // void Clear() 移除所有的键值对元素
        // map.clear();

        System.out.println(map);
        System.out.println("------------------------------------------------------");

        // V remove(Object Key) 根据键删除键值对元素
        map.remove("百事可乐");
        System.out.println(map);

        System.out.println("------------------------------------------------------");
        // boolean containsKey(Object Key) 判断集合是否包括指定的键
        boolean resultKey1 = map.containsKey("芬达");
        System.out.println(resultKey1);
        boolean resultKey2 = map.containsKey("可口可乐");
        System.out.println(resultKey2);

        System.out.println("------------------------------------------------------");
        // boolean containsValue(Object Value) 判断是否包括指定的值
        boolean resultVaule1 = map.containsValue("3.0元");
        System.out.println(resultVaule1);
        boolean resultVaule2 = map.containsValue("6.0元");
        System.out.println(resultVaule2);

        System.out.println("------------------------------------------------------");
        // boolean isEmpty() 判断集合是否为空
        boolean empty = map.isEmpty();
        System.out.println(empty);

        System.out.println("------------------------------------------------------");
        // int size() 集合的长度，也就是集合中键值队的个数
        int size = map.size();
        System.out.println(size);

    }
}
