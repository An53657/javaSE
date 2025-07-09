package a03innerclassdemo03;

public class Test1 {
    /*
     * 匿名内部类书写格式：
     * new 类名或者接口名(){
     * 
     * 重写方法；
     * 
     * }；
     */

    public static void main(String[] args) {

        // 书写匿名内部类
        new Swim() {
            @Override
            public void swim() {
               
            }
        };

        new Animal() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show方法");
                
            }
        };






        // 真正没有名字的类是Swim后面的大括号{}
        // 跟Swim是是什么关系，是实现了接口
        // 所以整理需要重写Swimd的所有的抽象方法
        //new 的是没有名字这个类的对象

        // 把class删掉，剩余的内容就变成了没有名字的类
        // public class 类名 {
        // 这个没有名字的类想要实现Swim接口，表示这个没有名字的类实现了Swim接口
        // ，所以需要在类中接口里面所有抽象方法
        // 整体包括三个
        // 1. 包括 继承/实现关系
        // 2. 包括方法重写关系
        // 3. 包括创建对象关系
    }

    // {
    // @Override
    // public void swim() {
    // //  
    // }
}
