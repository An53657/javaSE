package Day08.test05;

public class StudentTest {
    public static void main(String[] args) {
        // 创建对象
        // 调用的的hi空参构造
        Student s = new Student();
        // 默认初始值
        System.out.println(s.getAge());

        Student ss = new Student("zz", 1);
        System.out.println(ss.getNae());
        System.out.println(ss.getAge());
    }
}
