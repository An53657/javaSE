package Day02;
//键盘输入数字求和
//1.导入java.util.Scanner类
import java.util.Scanner;
public class Scannertext01 {
    //主入口
    public static void main(String[] args) {
     //创建对象，
        Scanner sc = new Scanner(System.in);
     //提示用户输入数据
     System.out.println("请输入一个整数：");

     //接受数据第一个对象
        int numbe1 = sc.nextInt();
    //再次接受第二个对象
        int number2 = sc.nextInt();
    //输出数据
        System.out.println(numbe1+ number2);
    //关闭对象，释放资源
        sc.close();
        
}
}