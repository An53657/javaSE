//需求：键盘录入一个字符串 统计该字符串中大写字母 小写字母 数字字符出现的次数
package Day10.stringdemo;

import java.util.Scanner;

public class StringDemo06 {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        sc.close();

        // 看到统计利用计算器器思想
        // 定义三个变量
        int smallCount = 0;
        int bigCount = 0;
        int numberCount = 0;
        // 遍历字符串，得到每一个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("数字字母有" + numberCount + "个");
    }
}
