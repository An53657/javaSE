/* 统计个数
 * 需求：字符串 "aaabbbcccddeeade"
 * 请统计字符串每一个字符出现的次数，并按照以下格式输出
 * 格式：
 * a(次数) b(次数) c(次数) d(次数) e(次数) 
 */
package Day23.a04treemapdemo04.treemapdemo03;

import java.util.Map;
import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapDemo01 {
    public static void main(String[] args) {

        // 新统计思想 利用Map集合进行统计
        // 如果题目中没有要求对结果进行排序，默认使用hashMap集合
        // 如果题目中要求对结果进行平排序，使用TreeMap集合

        // 定义字符串
        String str = "aaabbbcccddeeade";

        // 创建Map集合
        Map<Character, Integer> hs = new TreeMap<>();

        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            // 拿出每一个字符
            char c = str.charAt(i);
            // 拿到c到集合是否存在
            // 如果存在，表示当前字符右出现一次
            // 如果不存在，表示当前字符是第一次出现
            if (hs.containsKey(c)) {
                // 存在
                // 先把已经出现的次数拿出来
                int count = hs.get(c);
                // 表示当前字符右出现了一次
                count++;
                // 把自增次数的结果添加到集合中
                hs.put(c, count);
            } else {
                // 不存在
                hs.put(c, 1);
            }
        }
        // 遍历字符串，并按照指定格式输出
        // 可以用StringBurilder拼接，也可以用StringJoiner
        // 第一种方式：用StringBuilder拼接
        StringBuilder sb = new StringBuilder();
        // lambdabb表达式

        hs.forEach((key, vaule) -> sb.append(key).append("(").append(vaule).append(")"));
        // 打印

        System.out.println(sb);

        System.out.println("-------------------------------------");

        // 第二中方式用StringJoiner拼接
        StringJoiner sj = new StringJoiner("", "", "");
        hs.forEach((key, vaule) -> sj.add(key + "").add("(").add(vaule + "").add(")"));
        // 打印
        System.out.println(sj);

    }

}
