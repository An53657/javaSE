/*  需求：
 * 在实际开发中，如果我们需要在多种情况下选择其中一个，就可以选择switch语句
 * 当我们拨打某些服务电话时，一般会有按键选择
 * 假设现在我们拨打了一个机票预定电话
 *  电话中语言提示
 * 1.机票查询
 * 2机票预定
 * 3.机票改签
 * 4.退出服务
 * 其他按键也是退出服务，使用switc语句*/
package Day04.switchdemo;

import java.util.Scanner;

public class switchDemo04 {
    public static void main(String[] args) {
        // 键盘录入一个整数提示我们的选择

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入的选择");
        int choose = sc.nextInt();
        sc.close();

        // 根据不同的选择执行不同的代码

        switch (choose) {
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出服务");
                break;
            default:
                System.out.println("退出服务");
                break;
        }
    }
}
