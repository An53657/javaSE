package Day30.a01multithreadingdemo01.a08threaddemo08;

public class MyThreadDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "----" + i);
        }
    }
}