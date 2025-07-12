package Day15.demo01;
/*编写带有抽象类的标准javabean类
 青蛙frog 属性 ：名字、年龄     行为:吃虫子、喝水·
狗Dog 属性 ：名字、年龄         行为:吃骨头、喝水
山羊sheep  属性 ：名字、年龄         行为:吃骨头、喝水
 */


public class Test {
    public static void main(String[] args) {
        // 创建青蛙对象
        Frog f = new Frog("小绿色", 1);
        System.out.println(f.getName() + f.getAge());
        f.drink();
        f.eat();

    }
}
