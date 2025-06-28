package Day02.logicaloperatordemo;

public class LogicaloperatorDemo01 {
    public static void main(String[] args) {
        // 逻辑运算符的使用
        // 1. && 两者都为true，结果才为true
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & true); // false
        System.out.println(false & false); // false
        // 只要有一个为false，结果就是false
        // |2. 或者运算符
        // 两者都为false，结果才为false
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | true); // true
        System.out.println(false | false); // false

    }
}
