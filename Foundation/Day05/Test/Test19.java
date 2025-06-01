/*  朋友聚会的时候有可能会玩：逢七过的游戏
 * 游戏规则是：从任意的数字开始报数，当你要的数是包含·7或是7的倍数·的时候
 * 说 过
 * 需求 用程序打印1~100之间满足逢七过的数据
 */
package Day05.Test;

public class Test19 {
    public static void main(String[] args) {
        // 分析 十位是 7 个位是7 7的倍数
        // 要拿到~100之间的数
        // 开始条件是：1
        // 结束条件是：100
        for (int i = 1; i <= 100; i++) {
            // 判断每一个数字符合打印过，不符合打印真实的数字
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                // 结束本次循环
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
