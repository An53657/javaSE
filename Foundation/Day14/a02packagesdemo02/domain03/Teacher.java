package Day14.a02packagesdemo02.domain03;

public class Teacher {
    private int age;
    private String name;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.age = age;
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
