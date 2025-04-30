//利用while循环打印1~100
package Day03.whileDemo;

public class while01 {
    public static void main(String[] args) {
        
        //while循环格式
        //初始化语句;
        //while(条件判断语句){
        //循环体语句;
        //条件控制语句;
        //}

        //分析
        //开始条件是：1
        //结束条件是：100

        int i = 1;//初始化语句，定义一个1表示循环的开始
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
