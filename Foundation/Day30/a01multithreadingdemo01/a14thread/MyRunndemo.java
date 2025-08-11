package Day30.a01multithreadingdemo01.a14thread;

public class MyRunndemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("----" + i);
        }
    }
}
