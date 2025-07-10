/*  方法名                                              说明
       public static void exit(int static)                 终止当前运行的java虚拟机
       public static long currentTimeMillis()              返回当前系统时间毫秒值形式
       public static void arraycopy(数据源数组，起始索引，目的地索引，起始索引，拷贝个数)    拷贝数组
 */
package Day18.a02systemdemo02;

public class Systemdemo02 {
    public static void main(String[] args) {
        // public static long currentTimeMillis() 返回当前系统时间毫秒值形式
        // 是从时间原点开始，到代码运行时间，时间原点：1970年1月1日0.0.0，我国在东巴区，有八个小时的时差
        //以毫秒形式展示
        long c = System.currentTimeMillis();
        System.out.println(c);
    }

}
