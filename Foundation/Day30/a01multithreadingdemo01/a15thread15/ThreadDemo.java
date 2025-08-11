/*
 自定义线程池(参数详解/参数的作用)

                    核心元素一：正式员工数量                      ------->    核心线程数量(不能小于0)
                    核心元素二：餐厅最大员工数量                  ----->       线程池池中最大线程数量(最大数量>=核心线程数量)
                    核心元素三：临时员工空闲多长时间被辞退(值)     --->         空闲时间(值) (不能小于0)
                    核心元素四：临时员工空闲多长时间被辞退(单位)   --->         空闲时间(单位) (用TimeUnit指定)
                    核心元素五：排队的客户                       --->         阻塞队列 (不能位null)
                    核心元素六：从哪里招人                       --->         创建线程的方式 (不能为null)
                    核心元素七：当队列人数过多，超出的下次在来      --->        要执行的任务过多时的解决方案   (不能为null)
                               (拒绝服务)
                    */

package Day30.a01multithreadingdemo01.a15thread15;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadDemo {
    public static void main(String[] args) {
        // 自定义线程池池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                4, // 核心线程数量(不能小于0)
                10, // 线程池池中最大线程数量(最大数量>=核心线程数量)
                1, // 空闲时间(值) (不能小于0)
                TimeUnit.MINUTES, // 闲时间(单位) (用TimeUnit指定)
                new ArrayBlockingQueue<>(3), // 阻塞队列 (不能位null)
                Executors.defaultThreadFactory(), // 创建线程的方式 (不能为null)
                new ThreadPoolExecutor.AbortPolicy()); // 要执行的任务过多时的解决方案 (不能为null)
        pool.shutdown();
    }
}
