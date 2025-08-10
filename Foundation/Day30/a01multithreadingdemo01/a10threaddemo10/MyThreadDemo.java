package Day30.a01multithreadingdemo01.a10threaddemo10;

public class MyThreadDemo implements Runnable {
    static int ticket = 0;

    @Override
    public void run() {
        // 循环
        while (true) {
            // 同步代码块(同步方法)
            if (method())
                break;

        }
    }

    public synchronized boolean method() {
        // 判断共享数据是否到了某尾 如果到了末尾怎么办
        if (ticket == 100) {
            return true;
        } else {
            // // 判断共享数据是否到了末尾 如果没有到了末尾怎么办
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
        }
        return false;
    }

}
