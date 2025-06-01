/* 需求 
*  定义一个数组，存储1，2，3，4，5
 * 遍历数组得到每一个元素 并求数组里面所有数据和和
 */
package Day05.Test;

public class Test15 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 1, 2, 3, 4, 5 };
        // 遍历数组
        // 定义一个变量，表示求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // i 表示数组里的每一个索引
            // [i] 依次表示数组里面每一个元素
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}
