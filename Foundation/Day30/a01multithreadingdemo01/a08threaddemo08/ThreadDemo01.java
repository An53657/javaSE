package Day30.a01multithreadingdemo01.a08threaddemo08;

public class ThreadDemo01 {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程对象
        MyThreadDemo mtd1 = new MyThreadDemo();
        mtd1.setName("Mtd1");
        mtd1.start();

        mtd1.join();

        /*
         * 表示把mtd1这个线程 插入到当前线程之前
         * 当前线程 main线程
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程" + i);
        }
    }
}
