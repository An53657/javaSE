package Day30.a01multithreadingdemo01.a02runnabledemo02;

public class MyRunnDemo01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "Hello,world!");
        }
    }

}
