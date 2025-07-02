package Day11.stundentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StundentTest {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Stundent> list = new ArrayList<>();
        // loop指定循环跳出
        loop: while (true) {
            // 初始菜单
            System.out.println("----欢迎使用学生管理系统----");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入你的选择");

            // 创建键盘录入对象
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            // 选择
            switch (choose) {
                case "1":
                    addStundent(list);
                    break;
                case "2":
                    deleteStundet(list);
                    break;
                case "3":
                    update(list);
                    break;
                case "4":
                    queryStundent(list);
                    break;
                case "5":
                    System.out.println("退出");
                    break loop;
                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    // 添加学生
    public static void addStundent(ArrayList<Stundent> list) {
        // 创建键盘录入
        Scanner sc = new Scanner(System.in);
        // 创建空参构造
        Stundent stu2 = new Stundent();
        System.out.println("请输入学生的Id");
        String ID = sc.next();
        stu2.setId(ID);

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        stu2.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        stu2.setAge(age);

        System.out.println("请输入学生的家庭住址");
        String address = sc.next();
        stu2.setAddress(address);

        list.add(stu2);
        // 打印添加成功的提示
        System.out.println("添加成功");

    }

    // 修改学生
    public static void deleteStundet(ArrayList<Stundent> list) {
        System.out.println("删除学生");
    }

    // 修改学生
    public static void update(ArrayList<Stundent> list) {
        System.out.println("修改学生");
    }

    // 查询学生
    public static void queryStundent(ArrayList<Stundent> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        // 打印表头信息
        System.out.println("ID\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Stundent stu1 = list.get(i);
            System.out.println(stu1.getId() + "\t" + stu1.getName() + "\t" + stu1.getAge() + "\t" + stu1.getAddress());

        }
    }
}
