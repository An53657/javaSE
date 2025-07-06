package Day14.polymorphics.a02polymorphicsdemo02;

public class Animal {
    private int age;
    private String colour;

    public Animal() {
    }

    public Animal(int age, String colour) {
        this.age = age;
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void eat(String something) {
        System.out.println("动物在吃东西： " + something);
    }
}
