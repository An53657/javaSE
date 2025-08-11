/*
Exectors:线程池的工具类通过调用方法返回不同类型的线程池对象
方法名称                            说明
public static ExecutorService newCachedThreadPool()  创建一个没有上限的线程池
public static ExecutorService newFixedThreadPool(int nThread) 创建有上限的线程

 */
package Day30.a01multithreadingdemo01.a14thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线程池
        // public static ExectorService newCachedThreadPool() 创建一个没有上限的线程池
        ExecutorService po1 = Executors.newCachedThreadPool();

        // public static ExecutorService newFixedThreadPool(int nThread) 创建有上限的线程池
        ExecutorService po2 = Executors.newFixedThreadPool(2);

        // 提交任务
        po1.submit(new MyRunndemo());
        po2.submit(new MyRunndemo());

        // 销毁线程池
        // po1.shutdown();
    }
}
