
/*  需求:
 * 生成 1~100的随机数
 */
package Day05.Test;

import java.util.Random;

public class Test23 {
    public static void main(String[] args) {
        // 创建新对象
        Random r = new Random();

        // 循环用for循环
        // 使用这个类来生成随机数
        int number0 = r.nextInt(100) + 1;//
        System.out.println(number0);

        // ==============================================================================
        // 密决可以生成任意之间的随机数7~15之间的
        // 这个范围头尾都减去一个值，让//这个范围从开始 -7可以了 0~8
        // 尾巴+1 8+1=9
        // 最终的结果 在加上第一步减去的值
        // Random o = new Random();
        // int number1 = o.nextInt(9)+7;
        // System.out.println(number1);
    }
}
