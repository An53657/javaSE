package Day15.demo02.a04interfacedemo04;

public abstract class Sport extends Person {
    public Sport() {
    }

    public Sport(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
