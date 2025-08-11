package Day30.a01multithreadingdemo01.a12threaddemo12;

public class Desk {
    // 作用控制生产者和消费者执行

    // 是否有面条
    public static int Foodflag = 0;

    // 面条的总个个数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();
}
