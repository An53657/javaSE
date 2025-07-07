package MyTest.inerefacedemo.testdemo;

public class Test {
    public static void main(String[] args) {
        //创建兔子对象
        Rabbity r = new Rabbity("小兔", 1);
        System.out.println(r.getName() + r.getAge());
        r.eat();

        //创建狗对象
        Dog d = new Dog("小狗", 2);
        System.out.println(d.getName() + d.getAge());
        d.eat();
        d.swin();

        //创建青蛙对象
        Frog f = new Frog("小蛙", 1);
        System.out.println(f.getName() + f.getAge());
        f.eat();
        f.swin();
    
    }
}
