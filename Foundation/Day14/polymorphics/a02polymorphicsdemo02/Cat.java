package Day14.polymorphics.a02polymorphicsdemo02;

public class Cat extends Animal{
    
    public Cat(){}
    public Cat(int age, String colour){
        super(age,colour);
    }

    @Override
    public void eat(String something) {
        // TODO Auto-generated method stub
        super.eat("年龄为" +  getAge() + "岁的老李养了一只"  + getColour() +" 颜色的猫咪着眼睛侧着头" + something);
    }

    public void catctHouse(){
        System.out.println("猫在抓老鼠");
    }
}

