package Day26.a01exceptiondemo01;

public class Stundent2 {
    private String name;
    private int age;

    public Stundent2() {

    }

    public Stundent2(String str) {
        String[] arr = str.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }

    public Stundent2(String name, int age) {
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
        return "Stundent2{name='" + name + "', age=" + age + "}";
    }
}
