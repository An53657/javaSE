package a03interfacedemo03.a01interfacedemo01;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");

    }

}
