//在实际的开发中，如果要根据不同的条件执行不同的代码块，可以使用if的第二个语句。
//需求：
//假设，用户在超市购物，商品的总金额是600元，
//键盘录入一个整数表示支付的金额，
//如果支付的金额大于等于600元，输出“支付成功”，否则输出“支付失败”。
//--------------------------------------if语句第二个格式，第二次练习--------------------------------------------------------
package Day04.ifDemo;
import java.util.Scanner;//导入Scanner类
public class ifDemoTest03 {
    public static void main(String[] args){//程序主入口
        Scanner sc = new Scanner(System.in);//创建Scanner对象
        System.out.println("录入一个整数表示支付的金额");//提示用户输入金额
        int money = sc.nextInt();//接收用户输入的整数
        sc.close();//关闭Scanner对象，释放资源

        if (money >= 600){//判断输入的金额是否大于等于600
            System.out.println("支付成功");//输出支付成功
           }else {//否则
               System.out.println("支付失败");//输出支付失败
           }           
    }
}
