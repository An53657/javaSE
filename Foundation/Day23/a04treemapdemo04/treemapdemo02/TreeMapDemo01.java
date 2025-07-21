/*  treeMap 基本使用
 需求
 键：学生对象
 值：学生籍贯
 要求 按照学生升序排列， 年龄一样的按照姓名首字母排列，同姓名，同年龄视为同一个人
 */
package Day23.a04treemapdemo04.treemapdemo02;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {
        // 创建Map集合
        Map<Stundent, String> map = new TreeMap<>();

        // 创建三个学生对象
        Stundent s1 = new Stundent("zhangsan", 23);
        Stundent s2 = new Stundent("lisi", 24);
        Stundent s3 = new Stundent("wangwu", 25);

        // 添加元素
        map.put(s1, "浙江");
        map.put(s2, "上海");
        map.put(s3, "安徽");

        // 打印
        System.out.println(map);
    }
}
