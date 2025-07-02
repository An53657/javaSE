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
    public static void addStundent(ArrayList<Stundent> list){
        // 创建键盘录入
        Scanner sc = new Scanner(System.in);

        // 创建空参构造
        Stundent stu2 = new Stundent();

        // 调用contains方法判
        while (true) {
            System.out.println("请输入学生的Id");
            String ID = sc.next();
            Boolean flag = contains(list, ID);
            if (flag) {
                System.out.println("ID已经存在，需要重新录入");
            } else {
                // 表示ID不存在，可以继续使用
                stu2.setId(ID);
                break;
            }

        }

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


    // 删除学生
    public static void deleteStundet(ArrayList<Stundent> list) {
        // 键盘录入删除的学生的ID
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生");
        String ID = sc.next();
        // 查询ID在集合中的索引
        int index = getIndex(list, ID);
        // ID存在删除
        // ID不存在，提示不存在并返回主菜单
        if (index >= 0) {
            list.remove(index);
            System.out.println("ID为:" + ID + "的学生已删除");
        } else {
            System.out.println("ID不存在,删除失败");
        }
    }

    // 修改学生
    public static void update(ArrayList<Stundent> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的ID");
        String ID = sc.next();
     
        //
        int index = getIndex(list, ID);

        if (index == -1) {
            System.out.println("要修改的" + ID + "不存在,重新输入");
            return;
        }
        //
        Stundent stu = list.get(index);
        System.out.println("请输入学生要修改的学姓名");
        String newName = sc.next();
        stu.setName(newName);

        //
        System.out.println("请输入学生要修改的年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        //
        System.out.println("请输入要修改的学生家庭住址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

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

    // 实现ID唯一
    public static boolean contains(ArrayList<Stundent> list, String ID) {
        // // 循环遍历集合得到每一个学生对象
        // for (int i = 0; i < list.size(); i++) {
        // // 拿到学生对象后，获取ID判断
        // Stundent stu = list.get(i);
        // String sid = stu.getId();

        // if (sid.equals(ID)) {
        // // 存在true
        // return true;
        // }
        // }
        // // 不存在 返回false
        // return false;

        // 调用getIndex方法() 相当于这个方法不做事，把对应的参数交给别人，自己判断就行了。
        // 如果说大于等于，表示存在，返回-1，-1大于等于0，返回假，把false返回出去就行
        return getIndex(list, ID) >= 0;
    }

    // 通过ID获取索引的方法来删除学生
    public static int getIndex(ArrayList<Stundent> list, String ID) {
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 得到集合的每一个学生对象拿出来
            Stundent stu = list.get(i);
            // 拿着集合的学生ID跟要查的ID比较
            String sid = stu.getId();
            if (sid.equals(ID)) {
                // 如果一样，那么返回索引
                return i;
            } else {
                return -1;
            }
        }
        // 当循环结束之后还没有找到，就表示不存在，返回-1
        return -1;
    }
}
