//需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
package Day10.stringdemo;

import java.util.Scanner;

public class StringDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个字符串");
        String str = sc.next();
        sc.close();
        // 并遍历
        for (int i = 0; i < str.length(); i++) {
            char o = str.charAt(i);
            System.out.println(o);
        }
    }
}
