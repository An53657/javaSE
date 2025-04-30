package Day02;
/*示例
public class vairabletest {
    public static void main(String[] qrggs ){
         //一开始没有乘客
    int count = 0;   
    //第一站：上去一位乘客
    count= count + 1;//车上有一位乘客 在原有的基础上加一位乘客
    //第二站：上去两位乘客，下来一位乘客
    count = count + 2 - 1;//车上有两位乘客，下来一位乘客    
    //第三站：上去两位乘客，下来一位乘客
    count =count + 2 -1;//车上有两位乘客，下来一位乘客
    //第四站：下来一位乘客
    count = count - 1;//车上有一位乘客
    //第五站：上去一位乘客，
    count = count + 1;//车上有两位乘客
    //请问：到了终点站，车上一共几位乘客？
    //答：车上有两位乘客
    
    //输出结果
     System.out.println("车上有" + count + "位乘客");
    }
}  */

//主入口
public class vairabletest {
    public static void main(String[] qrggs ){
         //一开始没有乘客
        int count =7;
    //第一站：上去一位乘客
        count = count + 1;//车上有一位乘客
    //第二站：上去两位乘客，下来一位乘客
        count = count + 2 -1;//车上有两位乘客，下来一位乘客
    //第三站：上去两位乘客，下来一位乘客
        count = count + 2 -1;//车上有两位乘客，下来一位乘客
    //第四站：下来一位乘客
    count = count - 1;//车上有一位乘客
    //第五站：上去一位乘客，
        count = count + 1;//车上有两位乘客
    //请问：到了终点站，车上一共几位乘客？
    //答：车上有两位乘客
    
    //输出结果d
        System.out.println("车上有" + count + "位乘客");
 
    }
}
