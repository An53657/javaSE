package Day14.a01polymorphicsdemo01.a02polymorphicsdemo02;

public class Person {
    // ## 3. 定义Person/饲养员
    // 属性：姓名
    // 年龄
    // 行为：keepet(Dog dog ,Strung something)方法
    // 功能：喂养宠物，something:表示喂养宠物

    // KeePet(Cat cat , String something)方法
    // 功能：喂养宠物，something:表示喂养宠物
    // 生成空参和带全参的构造方法，set和getg方法
    // ## 4. 定义测试类(完成一下打印效果)
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 行为：keepet(Dog dog ,Strung something)方法
    // 功能：喂养宠物，something:表示喂养宠物

    // KeePet(Cat cat , String something)方法
    // 功能：喂养宠物，something:表示喂养宠物
    // 生成空参和带全参的构造方法，set和getg方法

    public void keepet(Dog dog, String something) {
        System.out.println(
                " 年龄为" + getAge() + "岁的" + getName() + "养了两只" + dog.getColour() + "颜色的" + dog.getAge() + "岁的狗");
        dog.eat(something);
    }

    void keepet(Cat cat ,String something){
        System.out.println(" 年龄为"+getAge()+"岁的"+getName()+"养了两只"+cat.getColour() +"颜色的"+cat.getAge()+"岁的狗");
        cat.eat(something);
}
}
