package Day13.a02extendsdemo02.demo02;

public class ShaPei extends Dog {
    // 因为沙皮狗吃狗粮和吃骨头
    // 所以父类中的方法不能满足我们的需求了，所以重写

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
