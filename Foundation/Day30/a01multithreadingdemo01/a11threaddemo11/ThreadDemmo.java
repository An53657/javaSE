package Day30.a01multithreadingdemo01.a11threaddemo11;

public class ThreadDemmo {

    public static void main(String[] args) {
        MyThreadDemo t1 = new MyThreadDemo();
        MyThreadDemo t2 = new MyThreadDemo();
        MyThreadDemo t3 = new MyThreadDemo();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
