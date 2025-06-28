/*需求
 * 键盘录入两个数字，表示一个范围
 * 统计这个范围中
 * 即能被3整除，有能被5整除的数字有多少个
   */
package Day04.fordem;

import java.util.Scanner;

public class forDemo06 {
    public static void main(String[] args) {

        // 1.键盘录入一个数字，表示一个范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围的结束");
        int end = sc.nextInt();
        sc.close();

        // 统计变量
        // 统计个数的
        int count = 0;

        // 2.利用这个循环获取这个范围中的每一个数字
        // 开始条件是：start
        // 结束条件是：end

        for (int i = start; i <= end; i++) {
            // 3.对每一个数字进行判断，统计有多少个满足要求的数字
            if (i % 3 == 0 && i % 5 == 0) {
                // System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
