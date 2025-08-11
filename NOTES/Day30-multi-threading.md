# 多线程 multi-threading


---



## 1.什么是多线程
1. 什么是多线程
    有了多线程，就可以让程序同时多多件事情
    线程：是操作系统能够进行运算的最小单位，被包含进程之中，是进程中的实际运作单位
    进程：是程序中基本执行实体

2. 多线程的作用
    提高效率

3. 多线程应用场景
   想让多件事情同时运行就需要用的多线程
   比如：软件中的耗时操作，所以聊天软件，所有服务器


---



## 2.多线程两个概念
4. 并发：在同一时刻，有多个指令在单个CPU上交替执行
5. 并行：在同一时刻，有多条指令在多个CPU上同时执行


---


## 3.多线程的实现方式
6. 第一种实现方式
    继承Thread类的方式进行实现

    书写步骤
    1.自己定义一个类继承Thread类
    2.重写run方法
    3.创建子类对象，并启动线程

7. 第二种实现方式
   实现Runnable接口的方式进行实现

   书写步骤
   1.自己定义一个类实现Runnable接口
   2.重写里面的run方法
   3.创建自己类的对象
   4.创建一个Thread类对象，并开启线程 

8. 第三种实现方式
   利用Callable接口和Future接口方式实现

   书写步骤
   特点 可以获取多线程运行的结果
    1.创建一个类MyCallable实现callable接口
    2.重写call(返回值 表示多线程运行的结果)
    3.创建MyCallable对象(表示线程要执行的任务)
    4.创建FutureTask对象(管理多线程运行的结果)
    5.创建Thred类对象，并启动(表示线程)

---

|                  |  优点    |  缺点    |
| ---------------- | ---- | ---- |
| 继承Tread类      | 编程比较简单，可以直接使用Tread类中的方法 | 可以扩展性较差不能在继承其他的类 |
| 实现Runnable接口 | 扩展性较强，实现该借口的同时还可以 | 编程相对复杂，不能直接使用 |
|        实现Callable接口        | 继承其他的类 | Thread中的方法 |

---


## 4.常见的成员方法
9. 常见的成员方法
   
                    方法名称                            说明
                    String getName()                   返回此线程的名字
                    void setName(String name)          设置线程名称(构造方法也可以设置名称)
                    static Thread currentThread()      获取当前线程的对象
                    static void sleep(long time)       让线程休眠指定时间(单位 毫秒值)
                    setPriority(int newPriority)        设置线程优先级
                    final int getPriority()             获取线程的优先级
                    final void setDaemon(boolean on)    设置位守护线程
                    public static void yield()          出让线程/礼让线程
                    public static void join()           插入线程/插队线程




---

10. 线程生命周期

   ![线程生命周期](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-10 165621.png)

---



## 5.线程安全的问题
11. 同步代码块
    
            格式
            Synchronized(锁){
                操作共享数据的代码
            }

12. 特点
    - 锁默认打开，有一个线程进去了，锁自动关闭
    - 里面的代码全部执行完毕了，线程出来，锁自动打开 

13. 同步方法
    就是把synchonized关键字添添加到方法上

            格式
            修饰符 synchronizd 返回值类型 方法名(方法参数){}

14. 特点
    - 同步方法是锁住里面的所有代码
    - 锁对象不能自己指定
      - 非静态的:this
      - 静态    :当前类的字节码对象



---



## 6.死锁
15. 锁的嵌套

---

## 7.生产者和消费者
16. 生产者和消费者(等待唤醒机制)

---

    ![生产者和消费者(等待唤醒机制)](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-11 103030.png)

---

17. 常见方法
    
            方法名称                                说明
            void wait()                             当前线程等待，直到被其他线程唤醒
            void notify()                           随机唤醒单个线程
            void notifyAll()                        唤醒所有线程

---

## 8. 线程的状态

---

![线程状态0](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-11 131044.png)

![线程状态1](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-11 131310.png)

---



## 9.线程池



---



## 10.volatile



---


## 11.JVM



---



## 12.悲观锁、乐观锁、CAS



---



## 13.原子性



---




## 14.并发工具类

---





