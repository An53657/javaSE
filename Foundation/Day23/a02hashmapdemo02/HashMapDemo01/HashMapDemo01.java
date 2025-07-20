/* 存储学生对象并遍历
创建一个HashMap集合，键是学生对象(stundent)，值是籍贯(String)
存储三个键值对象，并遍历
要求：同姓名，同年龄认为是一个人
 */
package Day23.a02hashmapdemo02.HashMapDemo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        // 创建HashMap集合
        Map<Stundent, String> map = new HashMap<>();

        // 创建三个学生对象
        Stundent s1 = new Stundent("wangwu", 23);
        Stundent s2 = new Stundent("lisi", 26);
        Stundent s3 = new Stundent("wangwu", 23);

        // 添加到集合
        map.put(s1, "浙江");
        map.put(s2, "安徽");
        map.put(s3, "浙江");

        // 获取
        Set<Stundent> keys = map.keySet();

        // 增强for
        for (Stundent key : keys) {
            String value = map.get(key);
            System.out.println(key + value);
        }

    }
}
