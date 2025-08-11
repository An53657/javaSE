package Day30.a01multithreadingdemo01.a12threaddemo12;

public class Cooker extends Thread {
    // 写多线程的套路
    /*
     * 循环
     * 同步代码块
     * 判断共享数据是否到了末尾(到了末尾)
     * 判断共享数据是否到了末尾(没有到末尾 执行核心逻辑)
     */
    @Override
    public void run() {
        // 循环
        while (true) {
            // 同步代码块
            synchronized (Desk.lock) {
                // 判断共享数据是否到了末尾(到了末尾)
                if (Desk.count == 0) {
                    break;
                } else {
                    // 判断桌子上是否有食物
                    if (Desk.Foodflag == 1) {
                        // 如果有就等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 如果没有就制作
                        System.out.println("厨师在制作一碗面条");
                        // 修改桌子上的食状态
                        Desk.Foodflag = 1;
                        // 叫醒等待的消费者开吃
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
