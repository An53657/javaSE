/*练习 键盘录入数据
需求
键盘录入朋友姓名和年龄
姓名的长度在3-10之间
年龄的范围是20-50
超出这个范围是异常数据不能赋值，需要重新录入，一值录入到正确为止

提示：
需要考虑用户在键盘录入时的所有情况
比如：录入年龄超出范围，录入年龄时录入abc等
 */
package Day26.a01exceptiondemo01.exceptiondemo03;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        // 创建朋友对象
        Firend f = new Firend();
        while (true) {

            try {
                // 接受朋友对象
                System.out.println("请输入朋友的姓名");
                String name = sc.nextLine();
                f.setName(name);
                // 接朋友的年龄
                System.out.println("请输入朋友的年龄");
                String ageatr = sc.nextLine();
                int age = Integer.parseInt(ageatr);
                f.setAge(age);
                // 如果所有的数据是正确的，那么跳出循环
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {
                e.printStackTrace();
            } catch (AgeIndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
        sc.close();
        System.out.println(f);
    }
}
