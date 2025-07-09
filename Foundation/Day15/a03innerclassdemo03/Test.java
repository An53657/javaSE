package a03innerclassdemo03;

public class Test {
    // 需求：写一个javabean类描述汽车
    // 属性：汽车品牌、车龄、颜色、发动机品牌、使用年限
    // 内部类的访问特点：
    // 内部类可以直接访问外部类的成员，包括私有
    // 外部类要访问内部类的成员，必须创建对象

    public static void main(String[] args) {
        // 创建对象
        Car c = new Car();
        c.carName = "BWM";
        c.carColour = "黑色";
        c.show();
    }
}
