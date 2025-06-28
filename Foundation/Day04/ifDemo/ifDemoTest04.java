//----------------------------------------影院选票Test---------------------
//在实际开发中，电影院的选=选座也会使用到if语句，
//假设莫影院售卖100张票，票的序号是1-100，
//其中奇数票号坐在左边，偶数票号坐在右边，
//键盘录入一个整数表示电影·
//跟据不同情况，给出不同的提示信息：
//如果票号为奇数，那么打印·“”
//如果票号为偶数，那么打印·“右边座位”
package Day04.ifdemo;

import java.util.Scanner;

public class ifDemoTest04 {
    public static void main(String[] args) {// 主方法
        // 分析：
        // 键盘录入一个整数表示电影
        Scanner sc = new Scanner(System.in);// 创建键盘录入对象
        System.out.println("请输入票号");// 提示用户输入票号
        int ticket = sc.nextInt();// 接收用户输入的票号，类型为int
        sc.close();// 关闭键盘录入，防止内存泄露。

        // 判断票号是奇数还是偶数。
        // 只有当ticket在0~100之间，才是真实有效的票。
        if (ticket >= 0 && ticket <= 100) {// 做一个合法性判断 ticket 大于等于0并且小于等于100
            if (ticket % 2 == 1) {// ticket 除以2的余数为1，说明是奇数
                System.out.println("左边座位");
            } else {
                System.out.println("右边座位");
            }
        }
    }
}