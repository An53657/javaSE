/*  需求 定义一个方法 求一家商场每个季度的营业额
 * 根据方法计算出全年营业额
 */
package Day06.method;

public class MethodDemo06 {
    public static void main(String[] args) {
        // 带有返回值的方法 有三种调用
        // 直接调用
        // getSum(20, 50, 100);
        // 赋值掉
        // int number = getSum(20, 50, 100);
        // 输出调用
        // System.out.println(getSum(20, 50, 100);

        // 计算第一季度的营业额
        int num0 = getSum(20, 50, 100);
        // 计算第二季度的营业额
        int num1 = getSum(20, 500, 100);
        // 计算第三季度的营业额
        int num2 = getSum(20, 50, 100);
        // 计算第四度的营业额
        int num3 = getSum(20, 50, 100);
        // 计算全年的营业额
        int result = num0 + num1 + num2 + num3;
        System.out.println(result);

    }

    // 定义方法
    public static int getSum(int num0, int num1, int num2) {
        int result = num0 + num1 + num2;
        return result;
    }
}