//计算水仙花数的程序
package MyTest.Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 创建 Scanner 对象，从键盘读取输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入计算水仙花数的起始值：");
        int start = scanner.nextInt();
        System.out.println("请输入计算水仙花数的结束值：");
        int end = scanner.nextInt();

        System.out.println("以下是区间内的水仙花数：");
        // 循环遍历从 start 到 end 的所有数字
        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            // 使用循环计算当前数字各个位上数字的立方和
            while (temp > 0) {
                int digit = temp % 10; // 获取最低位数字
                sum += digit * digit * digit; // 累加当前位数字的立方
                temp /= 10; // 去掉最低位数字
            }
            // 判断当前数字是否为水仙花数
            if (num == sum) {
                System.out.println(num);
            }
        }
        // 关闭 Scanner 对象，释放资源
        scanner.close();
    }
}
