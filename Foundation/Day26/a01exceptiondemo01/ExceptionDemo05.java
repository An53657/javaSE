/*
- 自己处理(捕获异常)

               格式
               try{
                  可能出现异常的代码;
               } catch (异常名 变量名) {
                  异常处理的代码;
               }
            目的：当代码出现异常时，可以让代码继续往下执行

 */
package Day26.a01exceptiondemo01;

public class ExceptionDemo05 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        // 目的：当代码出现异常时，可以让代码继续往下执行

        try {
            // 可能出现的异常代码
            System.out.println(arr[4]); // 此处这里出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
                                        // new ArrayIndexOutOfBoundsException();
                                        // 拿着这个对象到catch的小括号对比，看括号中的变量是否可以接受这个对象
                                        // 如果能被接受，就表表示该异常就被捕获(抓住)，执行catch里面对应的代码
                                        // 当catch里面所有代码都执行完毕，继续执行try...catch体系下面的其他代码
        } catch (ArrayIndexOutOfBoundsException a) {
            // 如果出现了ArrayIndexOutOfBoundsException异常，怎么处理
            System.out.println("索引越界了");
        }
        System.out.println("执行了吗");
    }
}
