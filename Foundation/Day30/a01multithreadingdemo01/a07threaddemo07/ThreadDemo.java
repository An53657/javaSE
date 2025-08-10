package Day30.a01multithreadingdemo01.a07threaddemo07;

public class ThreadDemo {
    public static void main(String[] args) {
        // 创建线程
        MyThredDemo mtd1 = new MyThredDemo();
        MyThredDemo mtd2 = new MyThredDemo();

        // 设置名字
        mtd1.setName("mtd1");
        mtd2.setName("mtd2");

        //开启线程
        mtd1.start();
        mtd2.start();
    }
}
