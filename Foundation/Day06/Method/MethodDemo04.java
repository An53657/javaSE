/* 目标 掌握带参数的方法定义格式和调用格式
 * 带多个参数的方法定义和调用
 * 定义格式
 * public static void(参数1,参数2，/...){...}
 * 调用
 * 方法名(参数1,参数2,..){....}
 * 
 */
package Day06.Method;

public class MethodDemo04 {
    public static void main(String[] args) {
        // 调用方法
        getSum(0, 0);
    }

    // 定义一个带参数的方法
    public static void getSum(int number0, int number1) {
        int result = number0 + number1;
        System.out.println(result);
    }
}
