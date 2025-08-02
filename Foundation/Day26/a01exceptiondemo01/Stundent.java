package Day26.a01exceptiondemo01;

 

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
        if (age < 18 || age > 40) {
            // System.out.println("年龄超出限制");
            // 抛出一个异常
            throw new RuntimeException();
        } else {
            this.age = age;
        }

    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Actor{name='" + name + "', age=" + age + "}";
    }
}
