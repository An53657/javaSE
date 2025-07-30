package Day25.a03Functiondemo03.Functiondemo01;

public class Stundent {
    private String name;
    private int age;

    public Stundent() {

    }

    public Stundent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Stundent(String str) {
        this.name = str.split(",")[0];
        this.age = Integer.parseInt(str.split(",")[1]);
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
