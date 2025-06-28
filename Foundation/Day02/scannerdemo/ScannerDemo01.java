package Day02.scannerdemo; 
//键盘录入数据
//1.导入java.util.Scanner类
//书写要求：要写在类定义的上面
import java .util.Scanner;
public class ScannerDemo01 {
    //主入口
    public static void main(String[] args) {
        //2.创建对象，表示我要用Scanner这个类
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        //3.接受数据
        //变量i记录了录入的数据
        int i = sc.nextInt();
        //4.输出数据
        System.out.println("你输入的数据是：" + i);
        //5.关闭对象，释放资源  
        sc.close();
    }
}
