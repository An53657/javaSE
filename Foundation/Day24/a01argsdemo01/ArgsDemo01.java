/*可变参数练习
 * 假如需要定义一个方法求和，该方法可以灵活的完成如下需求
 * 计算2个数据求和
 * 计算3个数据求和
 * 计算4个数据求和
 * 计算n个数据求和
 */
package Day24.a01argsdemo01;

public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(getSun(11, 12));
        System.out.println(getSun(11, 13, 14));
        System.out.println(getSun(11, 12, 13, 14));
    }

    public static int getSun(int a, int b) {
        return a + b;
    }

    public static int getSun(int a, int b, int c) {
        return a + b + c;
    }

    public static int getSun(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
