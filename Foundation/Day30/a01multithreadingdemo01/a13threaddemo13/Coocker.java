package Day30.a01multithreadingdemo01.a13threaddemo13;

import java.util.concurrent.ArrayBlockingQueue;

public class Coocker extends Thread{
        ArrayBlockingQueue<String> queue;

        public Coocker(ArrayBlockingQueue<String> queue){
           this.queue = queue;
        }
    @Override
    public void run() {
         while (true) {
            try {
                queue.put("面条");
                System.out.println("添加了面条");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
    }
}
