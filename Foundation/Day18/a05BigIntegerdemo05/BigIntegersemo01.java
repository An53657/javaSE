package Day18.a05BigIntegerdemo05;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegersemo01 {
    public static void main(String[] args) {
        // 构造方法
        // 方法名 说明
        // public BigInteger (int num, Random rnd) 获取随机大整数，范围[ 0~ 2 的 num 次方 - 1]
        // public BigInteger(String val) 获取指定的大整数
        // public BigInteger(String val , int radix) 获取指定进制的大整数

        // 静态方法获取BigInteger对象，内部有优化
        // 细节：对象一旦创建就不能发生改变了

        // 创建BigInteger对象
        // public static BigInteger valOf(log val)

        // 创建Random对象
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            // 获取随机大整数，范围[ 0~ 2 的 num 次方 - 1]
            BigInteger bd1 = new BigInteger(3, r);
            System.out.println(bd1);
        }
        // public BigInteger(String val) 获取指定的大整数

        BigInteger bd2 = new BigInteger("444444444444444444444444444");
        System.out.println(bd2);

        // public BigInteger(String val , int radix) 获取指定进制的大整数
        BigInteger bd3 = new BigInteger("111", 2);
        System.out.println(bd3);

        // 静态方法获取BigInteger对象，内部有优化
        // 能表示的范围比较小，只能在long的取值范围之内，如果超出long的取值范围就报错了
        // 对常用的数字 -16 - 16 进行了优化
        // 提前把-16 - 16 先创建好BigIntegerrg 如果多次获取就不会重新创建新的了

        // 创建BigInteger对象
        // public static BigInteger valOf(log val)
        BigInteger bd4 = BigInteger.valueOf(4);
        System.out.println(bd4);
    }
}
