//计算斐波那契数列的前 n 项
//用循环Test01;
package MyTest.testdemo;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        // 创建 Scanner 对象用来从键盘读取输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入斐波那契数列的项数：");

        // 读取用户输入的项数
        int n = scanner.nextInt();

        // 当输入的数字不合法时（n<=0），提示用户重新输入并结束程序
        if (n <= 0) {
            System.out.println("请输入一个大于0的数字。");
            scanner.close();
            return;
        }

        // 创建一个长度为 n 的数组来存储斐波那契数列
        int[] fibonacci = new int[n];

        // 初始化第一项为 0
        fibonacci[0] = 0;
        // 当斐波那契数列至少有两项时，初始化第二项为 1
        if (n > 1) {
            fibonacci[1] = 1;
        }

        // 从第3项开始，通过循环计算每一项的值（当前项等于前两项之和）
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // 输出结果：依次打印斐波那契数列中的数字
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println();

        // 关闭 Scanner，释放资源
        scanner.close();
    }
}