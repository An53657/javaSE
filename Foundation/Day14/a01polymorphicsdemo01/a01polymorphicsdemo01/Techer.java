package Day14.a01polymorphicsdemo01.a01polymorphicsdemo01;

public class Techer extends Person {
    @Override
    public void show() {
        System.out.println("老师的信息为：" + getName() + ", " + getAge());
    }
}
