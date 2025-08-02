/*
Throwable成员方法
方法名                        说明
public Sting getMessages()    返回此throwable的详细消息的字符串
public String toString()      返回此可抛出的简短描述
public void prinstStaackTrace()  把异常的错误信息输出在控制台中 
                                 仅仅是打印信息，不会停止虚拟机运行
 */
package Day26.a01exceptiondemo01.exceptiondemo01;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String r = e.getMessage();
            System.out.println(r);
        }

        System.out.println("---------------------------------");
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException s) {
            String w = s.toString();
            System.out.println(w);
        }

        System.out.println("---------------------------------");
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException v) {
            v.printStackTrace();
        }

        System.out.println("---------------------------------");

        System.out.println("执行了吗");

        System.out.println("---------------------------------");
    }
}
