/*  需
 * 定义一个数组，将数组上的0索引与和最大索引值进行交互
 */
package Day05.Test;

public class Test12 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 1, 2, 3, 4, 5 };
        // 数据交互
        // 定一个临时变量 记录0索引上的数
        int temp = arr[0];
        // 把4索引上的值赋值给0索引
        arr[0] = arr[4];
        // temp的值赋给4索引上值
        arr[4] = temp;
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
