/*需求 键盘录入一个整数x 判断是否是质数 
 * 如果一个数只能被1和它本身整除，那么这个数就是质数，否则是合数
 * eg:3 = 1 * 3
 * 6 = 1 * 5
 * 4 = 2 * 2 1 * 4
 * 6 = 1 * 6 2 * 3 
*/
package Day05.Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        sc.close();

        // 定义一个变量，表示标记
        // 标记这number是一个质数
        // ture 是一个质数
        // false 不是一个质数

        boolean flag = true;

        // 循环判断是否为质数
        // 写个循环 从2开始判断 一直判断number - 1 为止
        // 看这个范围有没有被number整除的
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                // 如果在循环中，遇到一个数你被number，那么修改fage里的值
                // 如果在这个范围以内，所有的数字都判断完了，都不能被number整除，flagli的
                // 值不会变。
                flag = false;
                // System.out.println(number + "是一个质数");
                break;// 跳出这个循环
            } // 下面的这个判断是错误的，看下面注释
              // else {
              // System.out.println(number + "不是一个质数");
              // }
        }
        // 当这个循环结束了，表示所有范围之内的所有数字的判断结束了
        // 此时才能判断number是一个质数

        // 如果说flag的值是一个ture，此时是一个质数，否则不是
        if (flag) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "不是一个质数");
        }
    }
}
