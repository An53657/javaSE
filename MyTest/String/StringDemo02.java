//需求：键盘录入一个字符串 统计该字符串中大写字母 小写字母 数字字符出现的次数 (练习)
package MyTest.String;

import java.util.Scanner;

public class StringDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        sc.close();
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("数字字母有" + numberCount + "个");
    }

}
