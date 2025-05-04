/* 需求：
*   生成10个1~100之间的随机数存入数组
 *  1.求出所有数据的和
 *  2.求出所有数的平均数
 *  3.统计有多少数据比平均数小
 */
package Day05.Test;

import java.util.Random;

public class ArrDemo05 {
    public static void main(String[] args) {
        //1.定义一个使用动态初始化创建数组
        //2.数据类型[] 数组名 = new int[10];
        int[] arr = new int[220];

        //使用Random这个类来生成随机数
        Random r = new Random();
        //使用循环生成10个随机数
        for(int i = 0;i< arr.length;i++){
            //每循环一次生成随机数
            int number = r.nextInt(100)+1;
             //添加数字到数组中
        //数组名[索引] = 数据；
        arr[i] = number;
      }
      ////遍历数组
      //for(int i = 0;i< arr.length;i++){
      //  System.out.println(arr[i]);
      //}
      
      //1.求出所有数据的和
      //定一一个求和变量
      int sum = 0;
      for(int i = 0;i < arr.length;i++){
        //遍历数组的每一个元素
        //并把元素累加的sum中
        sum = sum + arr[i];
        
      }
      System.out.println("数组中所有数据的和为：" + sum);
     // 2.求出所有数的平均数
     //定义一个变量，拿这sum/以数组的长度
     int avg = sum / arr.length;
     System.out.println(avg);

     //3.统计有多少数据比平均数小
     //用累计思想
     int count = 0;
     for(int i =  0;i <arr.length;i++ ){
        if(arr.length < avg){
            count++;
        }
     
     }
        //当循环结束之后，就表示已经找到了所有的比平均数小的数据
        System.out.println("在数组中，一共有" + count + "个比平均数小的数据");

        //遍历数组，验证答案
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i]  + " ");
        }
     }
}
