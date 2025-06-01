/* 需求 
 * 定义一个数组 存入1~5  交互首位对应上的元素
 * 交换前 1，2，3，4，5
 * 交换后 5，4，3，2，1，
 */
package Day05.Test;

public class Test13 {
    public static void main(String[] args) {
        // 定一个数组
        int[] arr = { 1, 2, 3, 4, 5 };
        // 利用循环交互
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        // 遍历数组，输出交换后的结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
