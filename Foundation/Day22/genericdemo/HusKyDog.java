package Day22.genericdemo;

public class HusKyDog extends Dog {
    @Override
    public void eat() {
          System.out.println("一只叫做"+ grtName()+  "的" +  getAge() + "岁的哈士奇,正在吃狗头,边吃边拆家");
    }
}
