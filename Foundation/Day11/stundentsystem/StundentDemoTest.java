package Day11.stundentsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理系统主类
 */
public class StundentDemoTest {
    public static void main(String[] args) {
        // 创建学生集合
        ArrayList<Student> students = new ArrayList<>();
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 主循环，显示菜单并处理用户选择
        while (true) {
            System.out.println("--------------------");
            System.out.println("1： 添加学生");
            System.out.println("2： 删除学生");
            System.out.println("3： 修改学生");
            System.out.println("4： 查询学生");
            System.out.println("5： 退出");
            System.out.print("请输入您的选择: ");
            String choice = sc.next();

            // 根据用户输入选择功能
            switch (choice) {
                case "1":
                    addStudent(students, sc); // 添加学生
                    break;
                case "2":
                    deleteStudent(students, sc); // 删除学生
                    break;
                case "3":
                    updateStudent(students, sc); // 修改学生
                    break;
                case "4":
                    queryStudents(students); // 查询学生
                    break;
                case "5":
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("无效选择，请重新输入。");
            }
        }
    }

    /**
     * 添加学生方法
     * @param students 学生集合
     * @param sc 输入对象
     */
    public static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入学生ID: ");
        String id = sc.next();
        // 检查ID唯一性
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println("ID已存在，添加失败！");
                return;
            }
        }
        System.out.print("请输入姓名: ");
        String name = sc.next();
        System.out.print("请输入年龄: ");
        int age = sc.nextInt();
        System.out.print("请输入家庭住址: ");
        String address = sc.next();
        // 添加新学生到集合
        students.add(new Student(id, name, age, address));
        System.out.println("添加成功！");
    }

    /**
     * 删除学生方法
     * @param students 学生集合
     * @param sc 输入对象
     */
    public static void deleteStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入要删除的学生ID: ");
        String id = sc.next();
        // 查找并删除学生
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("该ID不存在，删除失败！");
    }

    /**
     * 修改学生方法
     * @param students 学生集合
     * @param sc 输入对象
     */
    public static void updateStudent(ArrayList<Student> students, Scanner sc) {
        System.out.print("请输入要修改的学生ID: ");
        String id = sc.next();
        // 查找学生并修改信息
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("请输入新姓名: ");
                s.setName(sc.next());
                System.out.print("请输入新年龄: ");
                s.setAge(sc.nextInt());
                System.out.print("请输入新家庭住址: ");
                s.setAddress(sc.next());
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("该ID不存在，修改失败！");
    }

    /**
     * 查询学生方法
     * @param students 学生集合
     */
    public static void queryStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        System.out.println("ID\t姓名\t年龄\t家庭住址");
        // 遍历并输出所有学生信息
        for (Student s : students) {
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress());
        }
    }
}

/**
 * 学生类，封装学生信息
 */
class Student {
    private String id;      // 学生ID
    private String name;    // 姓名
    private int age;        // 年龄
    private String address; // 家庭住址

    public Student(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAddress(String address) { this.address = address; }
}
