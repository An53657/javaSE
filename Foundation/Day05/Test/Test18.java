/*  需求键盘路人一个大于2的整数X 计算并返回X的平方根
 * 结果只保留整数部分，小数将舍弃
 */
package Day05.Test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        // 分析
        // 计算平方根，什么是平方根 4的平方根是2；9的平方根是3
        // eg
        // 我们可以从1 一个个往上去算
        // 1 * 1 =1用这个1来比较一下 <10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        // 推断：10的平方根在3~3之间

        // 在代码中，
        // 从1开始循环拿着数字的平方根跟原来的数字进行比较
        // 如果小于，那么继续往后判断
        // 如果相等 那么当前就是平方根
        // 如果大于的，前一个数字就是平方根的整数部分

        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int number = sc.nextInt();
        // 从1开始循环判断
        // 开始条件:1
        // 结束条件:number本身
        for (int i = 1; i <= number; i++) {
            // 判断平方根
            // 用i 比较number
            if (i * i == number) {
                System.out.println(i + "就是" + number + "的平方根");
                // 一旦找到了，循环就可以结束了，提升了代码运行效率
                break;
            } else if (i * i > number) {
                System.out.println((i - 1) + "就是" + number + "的平方根整数部分");
                break;

            }
            sc.close();
        }
    }
}
