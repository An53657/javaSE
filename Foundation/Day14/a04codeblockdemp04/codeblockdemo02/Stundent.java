package Day14.a04codeblockdemp04.codeblockdemo02;

public class Stundent {
    private String name;
    private int age;

    // 构造代码块

    static {
        System.out.println("静态代码块执行了");
    }

    public Stundent() {

        System.out.println("无参构造执行了");
    }

    public Stundent(String name, int age) {
        System.out.println("带参构造执行了");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int setAge() {
        return age;
    }
}
