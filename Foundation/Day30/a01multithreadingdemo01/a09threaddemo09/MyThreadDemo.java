package Day30.a01multithreadingdemo01.a09threaddemo09;

public class MyThreadDemo extends Thread {
    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThreadDemo.class) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;

                    System.out.println(getName() + "正在卖" + ticket);
                } else {
                    break;
                }
            }
        }
    }
}
