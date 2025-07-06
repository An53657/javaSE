package Day14.polymorphics.a01polymorphicsdemo01;

public class Test {
    public static void main(String[] args) {
        // 创建三个学生对象，并调用show方法
        Stundent s = new Stundent();
        s.setName("张三");
        s.setAge(23);

        register(s);
    }

    // 这个方法能接受学生 又能接受老师 还能接受管理员
    // 只能把参数写成这三个类型的父类

    public static void register(Person p) {
        p.show();
    }

}
