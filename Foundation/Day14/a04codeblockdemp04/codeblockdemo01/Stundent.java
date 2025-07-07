package Day14.a04codeblockdemp04.codeblockdemo01;

public class Stundent {
    private String name;
    private int age;


    //构造代码块
    //写作成员位置的代码块
    //作用：可以把多个构造方法中重复代码抽取出来
    //执行时机：我们创建本类对象的时候会先执行构造代码块在执行构造方法
    {
        System.out.println("开始创建对象了");
    }

    public Stundent() {}

    public Stundent(String name, int age) {
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
