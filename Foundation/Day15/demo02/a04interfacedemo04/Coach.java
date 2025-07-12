package Day15.demo02.a04interfacedemo04;

public abstract class Coach extends Person {
    public Coach() {

    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();

}
