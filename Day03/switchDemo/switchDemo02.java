/* 需求：键盘录入星期数，显示今天的减肥活动。
 * 周一： 跑步
 * 周二： 游泳
 * 周三： 慢走
 * 周四： 动感单车
 * 周五： 拳击
 * 周六： 爬山
 * 周日： 好好吃一顿*/
package Day03.switchDemo;

import java.util.Scanner;

public class switchDemo02 {
    public static void main(String[] args) {
        //1.键盘录入一个星期数，

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();
        sc.close();
        //2.利用switch对星期进行匹配。
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
