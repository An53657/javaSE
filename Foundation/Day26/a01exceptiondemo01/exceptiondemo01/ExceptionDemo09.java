/*
自己处理(捕获异常)四
如果try中遇到了问题，那么try下面的其他代码还会执行吗
下面的代码就不会在执行了，直接跳转到对应catch当中，执行catch里面的语句体
当时没有定义的catch与之匹配，那么还是会交给虚拟机进行处理
 */
package Day26.a01exceptiondemo01.exceptiondemo01;

public class ExceptionDemo09 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        try {
            System.out.println(arr[10]);
            System.out.println("执行了吗 ing");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }

        System.out.println("执行了吗");
    }
}
