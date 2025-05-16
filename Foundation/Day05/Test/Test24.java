/* 1.程序自动生成1~100随机数，使用程序实现猜出这个数字是多少

2.扩展小需求 加一个保底 3次猜不中，直接提示猜中了
    
注意点：
 * 1.生成随机数代码(int number = r.nextInt(100)+1;)
 * 不能写在循环里面，否则每一次都会生成新的随机数
 * 
 * 2.抽奖机制
 * 用点券抽水晶
 * 保底360次没抽到 
*/
package Day05.Test;

import java.util.Random;
import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        //计数器
        //用来统计已经猜了多少次
        int count = 0;

        //分析：
        //生成1~100之间的随机数
        //创建新对象
        Random r =  new Random();
        //接受对象
        int number = r.nextInt(100)+1;
        //生成的随机数打印一下
        System.out.println(number);

        //2.猜出这个数字是多少
        //创建键盘录入
        Scanner sc = new Scanner(System.in);
        
        while(true){
              //提示
            System.out.println("请输入你要猜的数字");
            //接受数据
            int guessNumber = sc.nextInt();
            //判断两个数字，给出不同的提示
            //猜出的数字大了 提示 大了
            //猜出的数字小了 提示 小了
            //猜出的数字一样 提示  猜中了
            count ++;
            if(count == 3){
                System.out.println("猜中了");
                break;
            }
            if(guessNumber > number){
                System.out.println("大了");
             }else if(guessNumber < number){
                System.out.println("小了");
             }else if(guessNumber == number){
                System.out.println("猜中了");
                break;
           }
        } 
        //关闭键盘录入
        sc.close();
    }
}
