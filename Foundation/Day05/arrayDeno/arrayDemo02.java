package Day05.arrayDeno;

public class arrayDemo02 {
    public static void main(String[] args) {
        // 利用索引对数组中的元素进行访问
        // 1.获取数组里的元素
        // 定义一个数组
        // 用静态创建数组简写格式：
        int[] array = { 1, 2, 3, 4, 5, 6 };
        // 获取数组第一位元素
        /// 格式:数组名[索引];
        // 其实就是0索引对应上的值
        // int number =array [0];
        // 定一种
        // System.out.println(number);
        // 第二种
        // 获取数组中1索引上对应的数据，并直接打印出来
        // System.out.println(array[1]);

        // 2.把数据存储到数组当中
        // 格式 数组名[索引] = 具体数据/变量
        // 细节:一旦覆盖了，原来的数据就不存在了
        array[0] = 120;
        System.out.println(array[0]);
    }
}
