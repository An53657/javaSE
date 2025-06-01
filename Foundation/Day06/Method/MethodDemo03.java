/* 目标 利用方法最简单的格式完成练习
 * 需求 在方法里面定义两个变量并求和打印
 */
package Day06.Method;

public class MethodDemo03 {
    public static void main(String[] args) {
        // 最简单调用格式
        getSum();
    }

    // 定义一个最简单的方法格式
    // public static void 方法名(){方法体;}
    // 调用格式
    // 方法名();
    public static void getSum() {
        int num0 = 10;
        int num1 = 20;
        int result = num0 + num1;
        System.out.print(result);

    }
}
