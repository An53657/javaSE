package Day14.a01polymorphicsdemo01.a02polymorphicsdemo02;

public class Dog extends Animal {
    // ## 1. 定义狗类
    // 属性：年龄
    // 颜色
    // 行为：eat(String something ) something表示吃的东西
    // lookHome看家,方法 无参数

    public Dog() {
    }

    public Dog(int age, String colour) {
        super(age, colour);
    }

    // keepet(Dog dog ,Strung something)方法打印内容如下：
    // 年龄为30岁的老王养了两只黑颜色的2岁的狗
    // 2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃

    @Override
    public void eat(String something) {
        // TODO Auto-generated method stub
        System.out.println("年龄为" + getAge() + "岁的老王养了两只" + getColour() + "的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("正在看家");
    }

}
