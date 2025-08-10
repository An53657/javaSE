/*第二种实现方式
自己定义一个类实现Runnable接口
2.重写里面的run方法
3.创建自己类的对象
4.创建一个Thread类对象，并开启线程 
 */
package Day30.a01multithreadingdemo01.a02runnabledemo02;

public class RuuDemo01 {
    public static void main(String[] args) {
        // 创建对象
        MyRunnDemo01 mrd1 = new MyRunnDemo01();
        MyRunnDemo01 mrd2 = new MyRunnDemo01();

        Thread t1 = new Thread(mrd1);
        Thread t2 = new Thread(mrd2);

        // 设置名字
        t1.setName("线程1");
        t1.setName("线程2");

        // 开启线程
        t1.start();
        t2.start();

    }
}
