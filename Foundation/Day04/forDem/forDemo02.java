//需求：
//打印1~5
//打印5~1
package Day04.fordem;

public class forDemo02 {
    public static void main(String[] args) {
        // 打印1~5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // 打印5~1
        // 分析
        // 开始条件是：5
        // 结束条件是：1
        // 每次循环都-1
        // >=1 由大变小依次-下去的
        for (int n = 5; n >= 1; n--) {
            System.out.println(n);
        }
    }

}
