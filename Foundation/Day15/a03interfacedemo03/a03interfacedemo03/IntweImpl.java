package a03interfacedemo03.a03interfacedemo03;

public class IntweImpl implements Inter1, Inter2 {

    // 类和接口之间是实现关系 可以单实现，也会有多实现 需要重写所要抽方法

    // 如果抽象方法有重名的只会写一次
    // 表示我即重写 Inter1的methood1的方法，
    // 也表示重写Inter2的methood1的方法
    @Override
    public void methood1() {

    }

    @Override
    public void methood5() {

        throw new UnsupportedOperationException("Unimplemented method 'methood5'");
    }

    @Override
    public void methood6() {

        throw new UnsupportedOperationException("Unimplemented method 'methood6'");
    }

    @Override
    public void methood2() {

        throw new UnsupportedOperationException("Unimplemented method 'methood2'");
    }

    @Override
    public void methood3() {

        throw new UnsupportedOperationException("Unimplemented method 'methood3'");
    }

}
