/*  获取随机数*/
package Day05.Test;

//首先声明这个类，表示要用了
import java.util.Random;//这个类可以生成随机数

public class Test22 {
    public static void main(String[] args) {
        // java帮我们写好了，只要调用这个类就好了

        // 创建对象表示我要用Random;这个类了，r是变量名是可以变的，建议不要改变，默认就好
        Random r = new Random();
        // 基本写法
        // 生成随机数
        // 此时的范围是 0~9包含0也包含9
        // 判断技巧：
        // 在小括号中，书写的是随机数生成的范围
        // 这个范围是从0开始的
        // 到这个数-1结束
        // 口诀:包头不包围，包左不包右
        for (int i = 1; i <= 1000; i++) {
            int number = r.nextInt(10);// 此时number是一个变量名是可以变的，
            System.out.println(number);
        }

    }
}
