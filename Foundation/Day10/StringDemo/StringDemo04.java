//以知正确的用户名和密码，请用报编程模拟用户登录，总共给三次机会，登录之后给处相应提示

package Day10.StringDemo;

import java.util.Scanner;

public class StringDemo04 {
    public static void main(String[] args) {
        // 定义两个变量
        String righrUsername = "Kelly";
        String rightPassword = "123456";

        // 键盘键入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String usereName = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();

            // 比较
            if (usereName.equals(righrUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    // 表示最后一次机会也输入错误了，提示账号被锁定
                    System.out.println("账号" + usereName + "被锁定，请系管理员：xxx-xxxx");
                } else
                    System.out.println("用户登录失败 用户名或密码有误,你还剩下" + (2 - i) + "次机会");
            }
        }
        sc.close();
    }
}
