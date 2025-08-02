/*
    格式
    try{
    可能出现异常的代码;
    } catch(异常名 变量名) {
     异常处理代码
    }
自己处理异常(捕获异常) 一
如果try中没有遇到问题，怎么执行
会把try里面的代码全部执行完毕，不会执行catch里面的代码
注意：
    只有当出现了异常才会执行catch里面的代码
 */
package Day26.a01exceptiondemo01;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("索引越界");
        }

        System.out.println("执行了吗");
    }
}
