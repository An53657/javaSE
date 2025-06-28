package Day02.logicaloperatordemo;

public class LogicaloperatorDemo02 {
    public static void main(String[] args) {
        // 逻辑运算符的使用
        // 1. ^ 逻辑异或运算符
        // 相同为false，不同为true
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // 2. ! 逻辑非运算符
        // 将true变为false，将false变为true
        System.out.println(!true); // false
        System.out.println(!false); // true

    }
}
