package Day30.a01multithreadingdemo01.a01theraddemo01;

public class MyThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "Hello,World!");
        }
    }

}
