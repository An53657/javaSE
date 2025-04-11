package Day02; //定义包名，表示该类属于Java.day02包
//键盘录入数据
import java.util .Scanner;
public class ScannerDemo02 {
    //主入口
    public static void main(String[] args) {
        //创建对象，表示我要用Scanner这个类
        Scanner sc = new Scanner (System.in);
        //接受数据
        //变量i记录了录入的数据
        int i = sc.nextInt();
        //输出数据
        System.out.println("你输入的数据是：" + i);
        //关闭对象，释放资源
        sc.close();
    }
}