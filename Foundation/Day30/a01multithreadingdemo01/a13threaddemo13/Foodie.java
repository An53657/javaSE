package Day30.a01multithreadingdemo01.a13threaddemo13;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
                try {
                    queue.take();
                    System.out.println("拿了一碗面条");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

