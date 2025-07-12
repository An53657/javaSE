package Day15.demo02.a04interfacedemo04.a05interfacedemo05;

public abstract class Coact extends Person {
    public Coact() {
    }

    public Coact(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
