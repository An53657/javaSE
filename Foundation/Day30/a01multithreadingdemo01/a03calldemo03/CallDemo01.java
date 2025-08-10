/*多线程第三种实现方式
特点 可以获取多线程运行的结果
    1.创建一个类MyCallable实现callable接口
    2.重写call(返回值 表示多线程运行的结果)
    3.创建MyCallable对象(表示线程要执行的任务)
    4.创建FutureTask对象(管理多线程运行的结果)
    5.创建Thred类对象，并启动(表示线程)
 */
package Day30.a01multithreadingdemo01.a03calldemo03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallDemo01 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 3.创建MyCallable对象(表示线程要执行的任务)
        MyCallDemo01 mc1 = new MyCallDemo01();

        // 4.创建FutureTask对象(管理多线程运行的结果)
        FutureTask<Integer> ft = new FutureTask<>(mc1);

        // 5.创建Thred类对象，并启动(表示线程)
        Thread t1 = new Thread(ft);

        t1.start();
        System.out.println(ft.get());
    }
}
