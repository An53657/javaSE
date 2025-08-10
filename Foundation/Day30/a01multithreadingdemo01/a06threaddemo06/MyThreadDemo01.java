package Day30.a01multithreadingdemo01.a06threaddemo06;

public class MyThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName() + "-----" + i);
        }
    }
}
