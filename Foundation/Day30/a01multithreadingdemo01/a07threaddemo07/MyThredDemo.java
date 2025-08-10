package Day30.a01multithreadingdemo01.a07threaddemo07;

public class MyThredDemo extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(getName() + "---------" + i);
        }
        // 表示出让CPU执行权
        Thread.yield();
    }
}
