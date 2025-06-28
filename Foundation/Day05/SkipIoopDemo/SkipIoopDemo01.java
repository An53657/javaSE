/*  跳过循环 第二个*/
package Day05.SkipIoopdemo;

public class SkipIoopDemo01 {
    public static void main(String[] args) {
        // 还是用for循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎吃了第" + i + "个");
            if (i == 3) {
                // 结束整个循环
                break;
            }
        }
    }
}
