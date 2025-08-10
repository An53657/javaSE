/*练习 线程安全的问题
需求
    某电影院目前正在上映国产大片，共有100张票，而它有3个窗口买票，请设计一个程序模拟该电影院卖票
    利用同步方法完成
 */
package Day30.a01multithreadingdemo01.a10threaddemo10;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThreadDemo mtd = new MyThreadDemo();

        Thread t1 = new Thread(mtd);
        Thread t2 = new Thread(mtd);
        Thread t3 = new Thread(mtd);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
