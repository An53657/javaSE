//练习：
//键盘录入一个整数表示钱包，
//如果大于100就吃网红餐厅，
//否则吃普通餐厅。
package Day04.ifDemo;

import java.util.Scanner;

public class ifDemoTest02 {
    public static void main(String[] args) {
        // 键盘录入一个整数表示钱包，如果大于100就吃网红餐厅，否则吃普通餐厅。
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入钱包里的钱：");
        // 提示用户输入数据
        int money = sc.nextInt();
        // 判断输入的数是正数还是负数
        // 判断输入
        if (money > 100) {
            // 如果输入的数大于100，输出“吃网红餐厅”
            System.out.print("吃网红餐厅");
        } else {
            // 如果输入的数小于等于100，输出“吃普通餐厅”

            System.out.println("吃普通餐厅");
        }
        // 关闭键盘录入，防止内存泄漏.
        sc.close();

    }
}
