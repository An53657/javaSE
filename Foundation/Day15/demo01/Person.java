package Day15.demo01;

public abstract class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    public int getAge() {
        return age;
    }

    // 抽象方法定义格式
    public abstract void work();

    // 抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
    // 有抽象方法的类一定是抽象类

    public void sleep() {
        System.out.println("在睡觉 ");
    }

}
