package Day24.a01argsdemo01;

public class ArgsDemo03 {
    public static void main(String[] args) {
        // 可变参数是JDK5提出的
        // 格式数据类型...名字
        // int...args

        // 可变参数的细节
        // 在方法的形参中，最多只能写一个可变参数
        // 在方法形参中，如果除了可变参数外，还有其他的形参，那么可变参数写在最后
        int sum = getSum(12, 3, 4, 5, 6, 7, 8, 8);
        System.out.println(sum);
    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum = sum + i;
        }
        return sum;
    }

}
