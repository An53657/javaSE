package Day08.Test05;

public class Student {
    private String name;
    private int age;

    // 如果我们没有写如何的构造方法
    // 那么虚拟机给我们加一个空参构造方法
    public Student() {
        System.out.println("hello,java!!");
    }

    // 带参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getNae() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void getAge(int age) {
        this.age = age;
    }
}
