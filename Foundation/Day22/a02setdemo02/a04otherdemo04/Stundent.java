package Day22.a02setdemo02.a04otherdemo04;

import java.util.Objects;

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
 

    // 重写HashCode方法和equals这样比的话就不是地址指二是属性值
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Stundent stundent = (Stundent) o;
        return age == stundent.age && Objects.equals(name, stundent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);

    }

    
}
