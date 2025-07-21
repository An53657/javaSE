package Day22.a01genericdemo01;

public class PersionCat extends Cat {
    @Override
    public void eat() {
        System.out.println("一只叫做"+ grtName()+  "的" +  getAge() + "岁的波斯猫,正在吃小饼干");
    }
}
