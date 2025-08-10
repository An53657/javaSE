package Day30.a01multithreadingdemo01.a05rundemo05;

public class MyRunDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "------" + i);
        }
    }

}
