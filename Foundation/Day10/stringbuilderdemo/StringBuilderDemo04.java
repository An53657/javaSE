package Day10.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        // 链式编程 当我们调用一个方法的时候 不需要用变量接受他们的结果 可以继续调用其他的方法

        // 调用方法
        int len = getString().substring(1).replace("A", "Q").length();
        System.out.println(len);

    }

    // 定义一个方法
    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        sc.close();
        return str;
    }
}
