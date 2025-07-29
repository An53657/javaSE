package Day25.a02streamdemo02.a02testdemo02;

public class Actor {
    private String name;
    private int age;

    public Actor() {

    }

    public Actor(String name, int age) {
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

    @Override
    public String toString() {
        return "Actor{name='" + name + "', age=" + age + "}";
    }
}
