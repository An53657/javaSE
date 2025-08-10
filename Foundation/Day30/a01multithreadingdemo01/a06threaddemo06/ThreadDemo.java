//final void setDaemon(boolean on)    设置位守护线程
package Day30.a01multithreadingdemo01.a06threaddemo06;

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线程
        MyThreadDemo01 mtd1 = new MyThreadDemo01();
        MyThreadDemo02 mtd2 = new MyThreadDemo02();

        // 设置名字
        mtd1.setName("mtd1");
        mtd2.setName("mtd2");

        // 设置守护线程
        mtd2.setDaemon(true);

        // 开启线程
        mtd1.start();
        mtd2.start();

    }
}
