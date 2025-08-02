/*
自己处理异常(捕获异常)三
如果try中遇到问题没有被捕获，怎么办
相当于try...catch的代码白写了，最中会交给虚拟机处理，虚拟机默认处理方式
 */
package Day26.a01exceptiondemo01;

public class ExceptionDemo08 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        }
        System.out.println("执行了吗");
    }
}
