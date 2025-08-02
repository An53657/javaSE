/*
- JVM:默认处理方式
1. 把异常的名称，异常原因及异常出现的位置等信息输出在控制台
2. 程序停止执行，下面代码不会在执行了
 */
package Day26.a01exceptiondemo01.exceptiondemo01;

public class ExceptionDemo04 {
    public static void main(String[] args) {
        System.out.println("总有一天会成功");
        // 算术异常 ArithmeticException
        // System.out.println(1/0);
        System.out.println("做最好的自己");
        System.out.println("不要被别人所影响");
    }
}
