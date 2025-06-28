package Day05.arraydeno;

public class arrayDemo01 {
    public static void main(String[] args) {
        // 静态初始化数组格式
        // 完整格式
        // 数据类型 [] 数组名 = new 数据类型[]{元素1,元素2,元素3....};
        // 简化后的格式
        // 数据类型 [] 数组名 ={元素1,元素2,元素,....}

        // 需求1.定义哟个数组存储5个学生的年龄
        // 完整格式：
        int[] age00 = new int[] { 14, 15, 13, 16, 13 };
        // 简写格式:
        int[] age01 = { 14, 15, 13, 16, 13 };

        // 需求2.定义哟个数组存储3个学生的姓名
        // 完整格式:
        String[] name00 = new String[] { "王五", "里斯", "张三" };
        // 简写格式:
        String[] name01 = { "王五", "里斯", "张三" };
        // 需求3.定一个数组存储4个学生的身高
        // 完整格式:
        double[] height00 = new double[] { 1.77, 1.88, 1.69, 1.82 };
        // 简写格式:
        double[] height01 = { 1.77, 1.88, 1.69, 1.82 };
        // 打印地址值
        System.out.println(age00);
        System.out.println(age01);
        System.out.println(name00);
        System.out.println(name01);
        System.out.println(height00);
        System.out.println(height01);
        // 扩展：
        // 解释地址值的会意 比如[I@5305068a
        // [:表示当前是一个数组
        // I:表示当前数组里的元素都是一个int类型的的
        // @:表示一个间隔符，(固定格式)
        // 5305068a才是数组的地址值，(十六进制的)
        // 平时我们习惯性会把这个整体叫做数组的地址值
    }
}