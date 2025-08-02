package Day26.a01exceptiondemo01.exceptiondemo03;

public class Firend {
    private String name;
    private int age;

    public Firend() {

    }

    public Firend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        int len = name.length();
        if (len < 3 || len > 10) {
            throw new NameFormatException(name + "格式有误;长度应该为: 3 ~ 10");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        if (age < 20 || age > 50) {
            throw new AgeIndexOutOfBoundsException(age + "超出了范围");
        }
        return age;
    }

    @Override
    public String toString() {
        return "firend{name='" + name + "', age=" + age + "}";
    }
}
