package Day15.demo03;

public class Car {
    String carName;
    private int carAg;
    String carColour;

    public void show() {
        System.out.println(carName);
        // 外部类要访问内部类的成员，必须创建对象
        Engine e = new Engine();
        System.out.println(e.engineAge);
    }

    class Engine {
        String engineName;
        String engineAge;

        // 内部类可以直接访问外部类的成员，包括私有
        public void show() {
            System.out.println(engineAge);
            System.out.println(carAg);
            System.out.println(carName);
        }
    }
}
