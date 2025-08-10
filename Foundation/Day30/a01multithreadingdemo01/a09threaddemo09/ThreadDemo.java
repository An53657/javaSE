/*练习 线程安全的问题
需求
    某电影院目前正在上映国产大片，共有100张票，而它有3个窗口买票，请设计一个程序模拟该电影院卖票

 */
package Day30.a01multithreadingdemo01.a09threaddemo09;

public class ThreadDemo {

    public static void main(String[] args) {
        MyThreadDemo mtd1 = new MyThreadDemo();
        MyThreadDemo mtd2 = new MyThreadDemo();
        MyThreadDemo mtd3 = new MyThreadDemo();

        mtd1.setName("窗口1");
        mtd2.setName("窗口2");
        mtd3.setName("窗口3");

        mtd1.start();
        mtd2.start();
        mtd3.start();

    }
}