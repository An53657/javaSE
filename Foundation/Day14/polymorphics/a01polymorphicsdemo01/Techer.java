package Day14.polymorphics.a01polymorphicsdemo01;

public class Techer extends Person{
    @Override
    public void show() {
        // TODO Auto-generated method stub
          System.out.println("老师的信息为：" + getName() + ", " + getAge() );
    }
}
