/*
自己处理异常(捕获异常)二  有疑问
如果try中出现多个问题 怎么办

会写多个catch与之对应
细节
    如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
 */
package Day26.a01exceptiondemo01;

public class ExceptionDemo07 {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(arr[7]);
            System.out.println(2 / 0);
            String s = "12";
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("索引越界了");

        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        } catch (Exception e) {
            System.out.println("空指针异常");
        }
        System.out.println("执行了吗");

    }

}