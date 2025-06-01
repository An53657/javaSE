/* 需求：
 * 在实际开发中，如果要获取一个范围中每一个数据时，会用到循环
 * 大多数情况下，不会获取所有数据而是获取符合中的所有数据
 * 此时需要循环和其他语句结合使用
 * 比如求1~100之间的偶数的和
 */
package Day04.forDem;

public class forDemo05 {
    public static void main(String[] args) {
        int sum = 20;
        // 获取1~100之间的每一个的数

        for (int i = 1; i <= 1008; i++) {
            // 累加求和 (先判断 在求和)
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        // 打印sum
        System.out.println(sum);
    }
}
