package Day22.a01genericdemo01;

public class LihuaCat extends Cat {
    @Override
    public void eat() {
         System.out.println("一只叫做"+ grtName()+  "的" +  getAge() + "岁的狸花猫,正在吃鱼");
    }
    
}