//  静态构造
//        public static BigInteger valOf(log val)                静态方法获取BigInteger对象，内部有优化

//        构造方法
//        public BigInteger add(BigInteger val)                  加法
//        public BigInteger subtract(BigInteger val)             减法
//        public BigIntefer multiply(bigInteger val)             乘法
//        public BigInteger divide(BigInteger val)               除法 获取商
//        public BigInteger divideAndRemaindeer(BigInteger val)               除法 获取商和余数
//        public boolean equals(Object x)                        比较是否相同
//        public BigInteger  pow(int exponent)                    次幂
//        public BigInteger  max/min(BigInteger val)              返回较大大值/返回较小值
//        public intValue(BigInteger val)                          转为int类型的整数，超出范围的数据有误    

package Day18.a05BigIntegerdemo05;

import java.math.BigInteger;

public class BigIntegersemo02 {
    public static void main(String[] args) {
        BigInteger bd1 = BigInteger.valueOf(5);
        BigInteger bd2 = BigInteger.valueOf(10);

        // 加法
        BigInteger bd3 = bd1.add(bd2);
        System.out.println(bd3);

        // 减法
        BigInteger bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        // 乘法
        BigInteger bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        // 除法 获取商和余数
        BigInteger[] arr = bd1.divideAndRemainder(bd2);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        // 比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //次幂
        BigInteger bd6 =bd1.pow(2);
        System.out.println(bd6);

        //返回较大大值/返回较小值
        BigInteger bd7 = bd2.max(bd1);
        System.out.println(bd7);

        //转为int类型的整数，超出范围的数据有误    
        BigInteger bd8 = BigInteger.valueOf(100000);
        int i = bd8.intValue();
        System.out.println(i);
        
    }
}