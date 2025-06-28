package Day10.stringdemo;

import java.util.Scanner;

public class StringDemo03 {
    public static void main(String[] args) {
        //假设键盘录入一个·字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str0 = sc.next();
        sc.close();
        //代码定义一个相同的字符串
        String str1 = "bluearchive";

        //用==比较
        System.out.println(str0 == str1);

        //结论： 以后自要比较字符串里的内容，就必须用String方法
    }
}
