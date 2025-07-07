package Day14.a03finaldemo03;

public class TestDemo01 extends Object {
    // 1. final修饰方法：表示最终方法，不能被重写。
    // 2. final修饰类： 表示最终类，不能被修改。
    // 3. 修饰变量： 表示常量，只能赋值一次，不能被修改。
    // - 基本数据类型： 变量的值不能被修改。
    // - 引用数据类型： 地址在不能被修改，内部的属性值可以修改。

    public static void main(String[] args) {
        // 3. 修饰变量： 表示常量，只能赋值一次，不能被修改。
        int a = 7;
        System.out.println(a);
        a = 10;
        // final修饰的变量叫做常量，只能赋值一次。
        
    }

}
