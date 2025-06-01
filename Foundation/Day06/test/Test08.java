/* 需求 定义一个方法判断数组中莫一个数是否存在，将结果返回调用处
 * 
 */
package Day06.test;

public class Test08 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 1, 3, 6, 8, 6, 9 };

        // 判断一个数字是否在数组里存在
        boolean flag = contains(arr, 52);

        System.out.println(flag);

    }
    // 我要干什么？ 判断数的莫一个数是存在
    // 我干这件事需要什么？数组
    // 方法是否需要调用？需要 ture 表示存在 flase 表示不存在

    // 定义方法
    public static boolean contains(int[] arr, int number) {
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
