/* 需求 使用方法重载思想 设计比较两个整数是否相同的方法
 * 要求兼容全整数类型(byte,short,double,long)
 */
package Day06.test;

 
public class Test03 {
    public static void main(String[] args) {
        //调用
        //直接调用
        compare(20.2, 253);
    }
    //方法重载
    //把相同功能的方法起成同样的名字
    public static void compare(byte b0,byte b1){
        System.out.println(b0 == b1 );

    }
    public static void compare(short s0,short s1){
        System.out.println(s0 == s1);
    }
    public static void compare(double d0, double d1){
        System.out.println(d0 == d1);
    }
    public static void compare(long n0,long n1){
        System.out.println(n0 == n1 );
    }
}
