/*  方法名                                              说明
       public static void exit(int static)                 终止当前运行的java虚拟机
       public static long currentTimeMillis()              返回当前系统时间毫秒值形式
       public static void arraycopy(数据源数组，起始索引，目的地索引，起始索引，拷贝个数)    拷贝数组
 */
package Day18.a02systemdemo02;

public class Systemdemo01 {

    public static void main(String[] args) {
        // public static void exit(int static) 终止当前运行的java虚拟机
        // 方法形参
        // 状态码
        // 0:正常关闭虚拟机
        // 非0：异常关闭虚拟机
        System.exit(1);
        System.out.println("看看执行了吗");
    }
}