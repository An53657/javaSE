//在实际开发中，多种情况判断时会用的if的第三个格式，
//这是判断第三个格式的练习, 需求：
//市场都会有VIP会员制，根据不同的会员等级，享受不同的折扣，
//假设商品的总价值为1000元，
//键盘录入会员等级，并计算出实际支付金额，
//会员1：享受9折优惠；
//会员2：享受8折优惠；
//会员3：享受7折优惠；
//非会员：不享受任何折扣优惠；

    package Day03;
import java.util.Scanner;//导入java.util.Scanner类
public class ifDemoTestTree06 {
    public static void main(String[]args){//主入口
        //记录商品的总价值
        int Price = 1000;
        //键盘路人入一个商品的总价值
        Scanner sc = new Scanner(System.in);
        System.out.println("会员等级");
        int VIP = sc.nextInt();
        sc.close();//关闭键盘录入
        //判断会员等级，并计算出实际支付金额
        if (VIP == 1){
            System.out.println("实际支付金额为"+ (Price*0.9));
        }else if (VIP == 2){
            System.out.println("实际支付金额为"+ (Price*0.8));
        }else if (VIP == 3){
            System.out.println("实际支付金额为"+ (Price*0.7));
        }else {
            System.out.println("实际支付金额为"+ Price);
        }
        
}
}