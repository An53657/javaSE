package Day30.a01multithreadingdemo01.a12threaddemo12;

public class Foodie extends Thread {
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
                    // 判断共享数据是否到了末尾(没有到末尾 执行核心逻辑)
                    // 先判断桌子上是否有面条
                    if (Desk.Foodflag == 0) {
                        // 如果没有就等待
                        try {
                            Desk.lock.wait();// 让当前线程跟锁判断
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 把吃的总数 -1
                        Desk.count--;
                        // 如果有， 就开吃
                        System.out.println("在吃面条,还能在吃" + Desk.count + "碗！！");
                        // 吃完之后唤醒厨师继续做
                        Desk.lock.notifyAll();
                        // 修改桌子的状态
                        Desk.Foodflag = 0;
                    }
                }
            }
        }
    }
}
