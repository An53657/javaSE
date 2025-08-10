/*
方法名称                            说明
                    String getName()                   返回此线程的名字
                    void setName(String name)          设置线程名称(构造方法也可以设置名称)
                    static Thread currentThread()      获取当前线程的对象
                    static void sleep(long time)       让线程休眠指定时间(单位 毫秒值)
 */
package Day30.a01multithreadingdemo01.a04threaddemo04;

public class Threaddemo01 {
    public static void main(String[] args) throws InterruptedException {
        // 创建对象
        MyThreaddemo mtd1 = new MyThreaddemo("你好");
        MyThreaddemo mtd2 = new MyThreaddemo();
        // String getName() 返回此线程的名字
        // void setName(String name) 设置线程名称(构造方法也可以设置名称)

        /*
         * 细节 ：
         * 如果没有该线程设置名字，线程有自己名字
         * 格式 Threead-X(X序号，从0开始的)
         * 如果要给线程设置名字 可以用set设置名字，也可以用构造方法
         * 
         * 
         */
        mtd2.setName("111");
        mtd1.start();
        mtd2.start();

        // static Thread currentThread() 获取当前线程的对象
        /*
         * 细节
         * 当JVM启动之后，会自动启动多条线程
         * 其中一条线程叫main线程
         * 它的作用就是调用main方法，并执行里面的代码
         * 在以前写过的代码，都是运行在main线程当中
         */
        System.out.println(Thread.currentThread());

        System.out.println(1111);

        // static void sleep(long time) 让线程休眠指定时间(单位 毫秒值)
        /*
         * 细节
         * 那条线程执行到这个方法 那么那条线程就会在这里停留相应的时间
         * 方法的参数 表示睡眠的时间 单位毫秒值
         * 当时间到了之后，线程会自动欢喜，继续执行下面的代码
         */

        Thread.sleep(5000);

        System.out.println(22222222);
    }
}
