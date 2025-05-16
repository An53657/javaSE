/*  需求
 * 用动态初始化数组，定义一个数组来存班级里50名学生的姓名
 * 姓名未知 学生报道了，在进行添加
 */
package Day05.Test;

public class Test17 {
    public static void main(String[] args) {
        //定义一个数组
        //动态格式
        //int[] arr new int[数组长度];
        String[] arr = new String [50];
        //添加数组
        arr[0] = "zhangsa";
        arr[1] = "zhangsan";
        arr[2] = "123";
        //打印
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);//打印出来的是默认初始化值:null

        //关于初始化的值的规律
        //整数类型：初始化值是:0
        //小数类型:初始化值是;0.0
        //字符类型:初始化值是:"/u00000" 其实就是空格
        //布尔类型:初始化值是:false
        //引用类型:初始化值是:null


    }
}
