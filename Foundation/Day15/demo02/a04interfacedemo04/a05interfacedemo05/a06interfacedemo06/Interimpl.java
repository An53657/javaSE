package Day15.demo02.a04interfacedemo04.a05interfacedemo05.a06interfacedemo06;

public class Interimpl implements Inter1 {

    @Override
    public void methood() {
        System.out.println("实现类重写了抽象方法");
    }
    // 不能用defult来重写默认方法

    // @Override
    // public defult void show() {
    // System.out.println("重写接口的默认方法");
    // }

}
