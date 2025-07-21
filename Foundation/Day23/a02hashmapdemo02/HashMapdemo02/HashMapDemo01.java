/*Map集合案例-统计投票人数
需求：某个班80名学生，现在需要组成秋游活动班长提供了四个景区(A,B,C,D)
没有学生只能选择一个景区，请统计出最终哪个景区想去的人最多
 */
package Day23.a02hashmapdemo02.hashmapdemo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        // 1
        // 需要让同学投票
        // 创建数组存储
        String[] arr = { "A", "B", "C", "D" };
        // 利用随机数模拟80名学生投票，并把结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        // 2.
        // 如果要统计的东西比较多，不方便使用计数器思想
        // 可以调用Map集合，利用集合进行统计
        HashMap<String, Integer> hs = new HashMap<>();
        // 增强for
        for (String name : list) {
            if (hs.containsKey(name)) {
                int count = hs.get(name);
                count++;
                hs.put(name, count);
            } else {
                hs.put(name, 1);
            }
        }
        // 3
        int max = 0;
        Set<Map.Entry<String, Integer>> entyries = hs.entrySet();
        for (Map.Entry<String, Integer> entry : entyries) {
            int count = entry.getValue();
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);

        // 4.
        for (Map.Entry<String, Integer> entry : entyries) {
            int count = entry.getValue();
            if (count == max) {
                System.out.println(entry.getKey());
            }
        }

    }
}
