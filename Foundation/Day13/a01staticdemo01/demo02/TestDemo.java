package demo02;

public class TestDemo {
    public static void main(String[] args) {
        //测试ArrUil工具类
        //创建int 数据、
        int [] arr = {10,20,50};
        //调用方法
        String str = ArrUtil.printArr(arr);
        //打印
        System.out.println(str);

        //
        double[] arr1 = {1.2,2.8,55.66};
        double ave = ArrUtil.getAve(arr1);
        System.out.println(ave);
    }
}
