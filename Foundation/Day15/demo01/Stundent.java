package Day15.demo01;

public class Stundent extends Person {

    public Stundent() {
    }

    public Stundent(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习");
    }
}
