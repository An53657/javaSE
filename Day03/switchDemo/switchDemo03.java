/*  需求：键盘录入一个星期数，输出工作日，休息日
 * (1-5)工作日 (6-7)休息日
 * 利用case穿透 */
//casec穿透就是没有写break导致的，
//执行流程
//首先还是会是拿小括号里的值跟下一个case值匹配
//如果匹配上了，就会执行对应的语句体，如果此时发现了break，那么结束整个switch语句，
//如果没有发现break,那么程序会继续写一个case的语句体，一直break,或是右大括号为止
package Day03.switchDemo;

import java.util.Scanner;


public class switchDemo03 {
    public static void main(String[] args) {
        //录入一个星期数

        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期");
        int week = sc.nextInt();
        sc.close();
        //2.利用switch语句进行选择

        switch(week) {
            case 1:
            case 2:
            case 3:
            case 4 :
            case 5:    
            System.out.println("工作日");
            break;
            case 6:
            case 7:
                System.out.println("休息日");
                 break;
            default:
             System.out.println("没有这个星期数");
             break;

        }
    }
}
