/*多线程第一种实现方式
自己定义一个类继承Thread类
2.重写run方法
3.创建子类对象，并启动线程
 */
package Day30.a01multithreadingdemo01.a01theraddemo01;

public class ThreadDemo01 {
    public static void main(String[] args) {
        // 创建对象
        MyThreadDemo01 mtd1 = new MyThreadDemo01();
        MyThreadDemo01 mtd2 = new MyThreadDemo01();
        // 设置名字
        mtd1.setName("线程1");
        mtd2.setName("线程2");
        // 开启线程
        mtd1.start();
        mtd2.start();
    }
}
