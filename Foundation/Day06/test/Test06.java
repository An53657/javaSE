/* 需求· 设计一个方法用于数组的遍历，要求遍历是在同一行中的，例如[11,22,33,44,55]
 * 
 */
package Day06.test;

public class Test06 {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 11, 22, 33, 44, 55 };
        // 调用方法
        printArr(arr);

        // 输出语句
        // System.out.println("abc");//先打印abc，后换行
        // System.out.print("abc");//只打印abc 不换行
        // System.out.println();//不打印任何数据，只做换行处理
    }
    // 定义一个方法用于数组遍历
    // 我要干什么？ 遍历数组
    // 我干这件事需要什么来完成？
    // 方法的调用出是否继续使用结果？不需要返回值

    public static void printArr(int[] arr) {
        // 循环开始前打印[
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                // 如果说打印的是最大索引，这时候打印数据，不用，隔开
                System.out.print(arr[i]);
                // 如果说打印的不是最后的数据，而是前面的数据 把， 给加上
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        // 循环结束后打印] 所有数据打印之后在进行换行处理
        System.out.println("]");
    }
}
