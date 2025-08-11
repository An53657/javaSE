package Day30.a01multithreadingdemo01.a13threaddemo13;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        Coocker c = new Coocker(queue);
        Foodie f  = new Foodie(queue);

        c.start();
        f.start();
    }
}
