/*
 * 
方法名                   说明
public static String toBinaryString(int i )      得的二进制
public static String toOctalString(int i)             得到八进制
public static String toHexString(int i)               得到十六进制
public static int parseIn(String s)                   将字符串类型的整数转成int类型的整数
 */
package Day19.integerdemo03;

public class InegerDemo01 {
    public static void main(String[] args) {
        // 获取包装类
        Integer i = 0;
        System.out.println(i);

        System.out.println("-----------得的二进制-------------------------");

        String Integer1 = Integer.toBinaryString(100);
        System.out.println(Integer1);

        System.out.println("----------- 得到八进制-------------------------");
        String interger2 = Integer.toOctalString(100);
        System.out.println(interger2);

        System.out.println("----------- 得到十六进制-------------------------");
        String interger3 = Integer.toHexString(100);
        System.out.println(interger3);

        System.out.println("------------------------------------");
        //将字符串类型的整数转成int类型的整数
        //java是一种强类型语言，每中数据在java中都有各自的数据类型
        //在计算的时候，如果不是同一种数据类型，是无法直接计算的
       int i1 =  Integer.parseInt("123");
       System.out.println(i1);
       System.out.println(i1 +1);
    

    }
}
