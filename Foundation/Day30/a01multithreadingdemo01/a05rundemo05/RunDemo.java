/*线程优先级
   setPriority(int newPriority)        设置线程优先级
    final int getPriority()             获取线程的优先级
 */
package Day30.a01multithreadingdemo01.a05rundemo05;

public class RunDemo {
    public static void main(String[] args) {
        MyRunDemo med1 = new MyRunDemo();
        MyRunDemo mdt2 = new MyRunDemo();

        // 创建线程对象
        Thread t1 = new Thread(med1, "第一");
        Thread t2 = new Thread(mdt2, "第二");

        t1.start();
        t2.start();

        t1.setPriority(1);
        t2.setPriority(10);

    }
}
