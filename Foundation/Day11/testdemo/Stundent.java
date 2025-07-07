package Day11.testdemo;

public class Stundent {
    private String name;
    private int age;

    public Stundent() {
    }

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

    public int getAge() {
        return age;
    }
}
