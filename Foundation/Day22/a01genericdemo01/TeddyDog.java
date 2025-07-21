package Day22.a01genericdemo01;

public class TeddyDog extends Dog {
    @Override
    public void eat() {
          System.out.println("一只叫做"+ grtName()+  "的" +  getAge() + "岁的哈士奇,正在吃狗头,边吃边蹭");
        
    }
}
