package Day23.a02hashmapdemo02.hashMapdemo01;

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

    @Override
    public String toString() {
        return "Stundent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setAfe(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

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
