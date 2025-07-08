//定义数组工具类
//按照如下方法编写工具类，类名ArrUtil
//提供一个工具类的方法printArr,用与返回数组的内容。
//返回字符串格式 [10，20，5，100]（只考虑整型数组，且只考虑一维数组)
//提供这一个工具方法getArrage,(用于返回平均分。只考虑浮点型，且只考虑一维数组)
//定义一个测试类TestDemo，调用工具类的工具方法，并返回结果。
package Day13.a01stademo01.demo02;

public class ArrUtil {
    // 私有化成员变量
    // 作用：外界无法直接创建对象
    private ArrUtil() {
    }

    // 此方法用于返回数组的长度
    public static String printArr(int[] arr) {
        // static 方面调用
        // 用StringBuilder进行字符串拼接
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        // 遍历数组
        for (int i = 0; i < arr.length; i++)
            // 如果不是最后一个元素，直接元素
            if (i == arr.length - 1) {
                sb.append(arr[i]);
                // 如果说不是最后一个元素，打印逗号空格
            } else {
                // 链式编程思想

                sb.append(arr[i]).append(", ");
            }
        sb.append("]");
        // 转换成字符串
        return sb.toString();
    }

    //此方法用于返回平均数
    public static double getAve(double [] arr){
        //先获总数
        //类加思想
        double sum = 0;
        //遍历数组
        for(int i = 0 ; i < arr.length;i++){
            //获得总分
            //sum就总和
             sum =  sum + arr[i];
        }
        //获取平均分
        //sum/数组长度
        return sum / arr.length;

    }

}
