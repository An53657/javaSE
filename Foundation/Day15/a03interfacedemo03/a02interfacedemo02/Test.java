// 接口中成员的特点

// 成员变量
// 接口中的成员变量自能是常量
// 默认修饰符；

//  public static final 
//  final:接口是一种规则，规则不能发生改变的，所以接口里面面的成员变量是常量,会用final修饰。
//  static:方法接口的调用，用接口名点(.)常量的名称就可以了。
//  public 表示公共的就表示在所有的地方都可以使用接口。
//  即使没有写java也会自能加上
// 构造方法
// 没有

// 成员方法
// 在jdk以前：只能定义抽象f方法
// 默认修饰符

//    public absstract
// 在jdk8的新特性： 接口中可以定义有方法体的方法
// 在jdk9的新特性： 接口中可以定义私有方法
package a03interfacedemo03.a02interfacedemo02;

public class Test {
    public static void main(String[] args) {
        System.out.println( Inter.a);

        //Inter.a = 20;
    }
}
