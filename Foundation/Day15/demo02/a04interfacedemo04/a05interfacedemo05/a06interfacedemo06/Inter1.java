package Day15.demo02.a04interfacedemo04.a05interfacedemo05.a06interfacedemo06;

public interface Inter1 {

    // 默认方法不是抽象方法，所以不强制重写

    public abstract void methood();

    public default void show() {
        System.out.println("show---------方法");
    }

    //public可以省略
}
