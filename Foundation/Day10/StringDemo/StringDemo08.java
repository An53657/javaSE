//需求： 定义一个方法，实现字符串的翻转 键盘录入一个字符串 调用该方法后 在控制台暑期结果
//利润键盘录入一个abc 输出结果cba
package Day10.stringdemo;

//导入一个Scanner
//import java.util.Scanner;

public class StringDemo08 {
    public static void main(String[] args) {
        // //键盘录入
        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入一个字符串");
        // String result =sc.next();
        // System.out.println(result);
        // sc.close();
        String result = reverser("hello");
        System.out.println(result);
    }

    // 定义一个方法
    // 问自己三个问题
    // 我要干嘛
    // 我干这件事需要什么才能完成
    // 我干完了是否要把结果返回给调用处
    // 如果调用处需要继续使用 那么必须返回
    // 如果调用处需不继续使用 那么可以返回可以不返回
    public static String reverser(String str) {
        // 定义一个长度为0的字符串
        String result = "";
        // 倒着遍历
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);// 用于遍历字
            // 得到每一个字符后 就可以更result进行拼接
            // 拼接之后产生新的字符串在赋值给result
            result = result + c;
        }
        // 当循环结束后 在给result做一个返回 返回给调用处reverser
        return result;
    }
}
