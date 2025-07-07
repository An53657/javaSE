package MyTest.inerefacedemo.testdemo;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("在吃虫子");
    }

    @Override
    public void swin() {
        System.out.println("在蛙泳");
    }

}
