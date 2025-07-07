package MyTest.inerefacedemo.testdemo;

public class Rabbity extends Animal {

    public Rabbity() {
    }

    public Rabbity(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("在吃胡萝卜");
    }

}
