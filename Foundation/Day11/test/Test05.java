//需求 定义一个集合 添加一些学生对象 并进行遍历
//学生类属性为 姓名 年龄 
//要求 对象的数据说键盘录入的数据
package Day11.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 1. 创建集合
        ArrayList<Stundent> list = new ArrayList<>();

        // 键盘录入一个对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            // 2. 创建学生对象
            Stundent s = new Stundent();
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();

            // 3.把键盘录入的数据赋值给学生对象，name age
            s.setName(name);
            s.setAge(age);

            // 4.把学生对象存入集合中
            list.add(s);

        }
        // 关闭键盘录入
        sc.close();

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            Stundent stu = list.get(i);
            System.out.println(stu.getName() + ",  " + stu.getAge());
        }

    }
}