package Day14.a02packagesdemo02.demo01;

public class Stundent {
    public static String techername;
    private String name;
    private int age;
    private String gender;

    public Stundent() {
    }

    public Stundent(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
