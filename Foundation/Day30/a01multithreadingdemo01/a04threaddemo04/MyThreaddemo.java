package Day30.a01multithreadingdemo01.a04threaddemo04;

public class MyThreaddemo extends Thread {

    public MyThreaddemo() {
    }

    public MyThreaddemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.print(getName() + "Hello,world!");
        }
    }
}
