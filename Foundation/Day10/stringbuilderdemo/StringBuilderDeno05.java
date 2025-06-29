//需求 键盘接受一个字符串 程序判断字符串是否是对称字符串 并在控制台打印是或不是
//对称字符串 123321 111
//非对称字符串 657 978 
package Day10.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDeno05 {
    public static void main(String[] args) {
        //使用StringBuilder场景
        //字符串拼接
        //字符串反转
        // 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        sc.close();
        System.out.println(str);

        // 创建StringBuilder
        // StringBuilder sb = new StringBuilder();
        // sb.append(str);
        // sb.reverse();
        // System.out.println(sb);

        // 用链式编程思想来写StringBuilder
        String result = new StringBuilder().append(str).reverse().toString();
        System.out.println(result);

        // 判断
        if (result.equals(str)) {
            System.out.println("当前字符串是对称字符串");
        } else {
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
