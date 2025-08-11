/*
等待唤醒机制
 */
package Day30.a01multithreadingdemo01.a12threaddemo12;

public class ThreadDemo {
    public static void main(String[] args) {
        Cooker c = new Cooker();
        Foodie f = new Foodie();

        c.setName("厨师");
        f.setName("吃货");

        c.start();
        f.start();
    }
}
