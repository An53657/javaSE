package Day10.APIDemo;
//导包 Scanner 一个键盘录入
import java.util.Scanner;

public class APIDemo01 {
    //程序的主入口
    public static void main(String[] args) {
        //创建Scanner一个键盘录入
        Scanner sc = new Scanner(System.in);
        //提示请录入一个小数
        System.out.println("请录入一个小数");
        //接受数据
        double result = sc.nextDouble();
        //打印
        System.out.println(result);
        //关闭键盘录入
        sc.close();
        
    }
}
