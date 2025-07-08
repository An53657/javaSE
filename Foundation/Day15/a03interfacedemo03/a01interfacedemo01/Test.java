/*编写带有接口和抽象类的标准javabean类
青蛙frog     属性 ：名字、年龄          行为:吃虫子、蛙泳
狗Dog        属性:  名字、年龄          行为:吃骨头、
兔子rabbit    属性 ： 名字、年龄          行为:吃胡萝卜
 */
package a03interfacedemo03.a01interfacedemo01;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.swim();
        d.setName("XXX");
        d.setAge(2);
        System.out.println(d.getName() + d.getAge());
    }
}
