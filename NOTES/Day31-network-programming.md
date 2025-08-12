# 网络编程 Network programming


---



## 1.什么是网络编程
1. 什么是网络编程
   计算机跟计算机之间通过网络进行数据传输

2. 常见的软件架构有那些
    CS:Client/Server 客户端/服务端 在用户本地需要下载并安装客户端的程序，在远程有一个服务器段的程序
    BS:Browser/Server 浏览器/服务器 只要一个浏览器，用户通过不同的网址，客户访问不同的服务器

3. 通信软件架构CS/BS的各有说明优缺点
   CS：客户端，服务端模式需要开发客户端
   BS：浏览器，服务端模式，不需要开发客户端
   CS：适合定制专业化的办公类软件 如IDEA 网游
   BS: 适合移动互联网应用，可以在任何地方随时访问分系统


---


## 2.网络编程三要素
4. 网络编程三要素
   - IP
   - 端口号
   - 协议

5. 网络编程三要素分表是什么
   IP：设备在网络小红的地址，是唯一的表识
   端口号：应用程序在设备中唯一的表识
   协议  ：数据在网络中传输的规则
           常见协议有UDP,TCP,HTTP,HTTPS,FTP


6. IP的作用
   设备在网络中的地址 是唯一的标识符

7. IPv4有什么特点
   目前主流方案
    最多2^32次方个IP 目前已用完

8. IPv6有什么特点
   为了解决IPv4不够用而出现的
   最多有2^128次方ip
   可以人地球上的每一粒沙子都设定ip

9. 现在如何解决IPv4不够用的问题
   利用局域网IP解决IP不够用的问题

10. 特殊IP是什么
    127.0.0.1(永远表示本机)

11. 常见的两个CMD命令
    ipconfig:查看本机的IP地址
    ping     检查网络是否畅通

12. Intaddress使用
static IntAddress getByName(String name) 确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
String getHostname()                      获取IP地址主机名
String getHostAdress                      返回文本显示中的IP地址字符串


13. 端口号
    - 应用程序在设备中唯一标识符

    - 端口号：由；两个字节表示整数，0~65535
              其中0~1023之间的端口号用于知名网络服务或应用
              使用1024以上的端口号就可以了
              一个端口号只能被一个应用程序使用

14. 协议

---

    ![协议](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-12 110742.png)


​    

    ![OSI参考模型](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-12 110829.png)
    
    ![TCP/IP参考模型](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-12 111218.png)
    
    - 计算机网络中，连接和通信规则被称为网络通信协议

---

   - UDP协议
      - 用户数据协议(User Dataggram Protocol)
      - UDP是面向无连接通信协议
        速度快，有大小限制一次最多发送64k，数据不安全，容易丢失数据

   - TCP协议
     - 传输控制协议(Transmission Control Protocol) 
     - TCP协议是面向连接的通信协议
       速度慢，没有大小限制，数据安全


---

## 3.UDP通信程序
16. UDP通信程序(发送数据)
    - 找快递公司           创建发生端口的DatagramSocket对象
    - 打包礼物             数据打包(DatagramPacket)
    - 快递公司发送包裹      发送数据
    - 付钱走人             释放资源

17. UDP通信程序(接受数据)
    - 找快递公司            创建接受端DatagramSocket对象
    - 接受箱子              接受打包好的数据
    - 从箱子里面获取礼物     解析数据
    - 签收走人              释放资源   


18. UDP的三种通信方式(代码实现)
    - 单播
      以前的代码就是单播
    
    - 组播
      组播地址;224.0.0.0 ~ 239.255.255.255
      其中224.0.0.0 ~ 224.0.0.255为留的组播地址

    - 广播 
      广播地址:255.255.255.255

---

## 4.TCP通信程序
19. 过程
    TCP通信协议是一种可靠的网络协议，在通信的两端各建立一个Socket对象
    通信之前要保证连接已建立
    通过Socket产生IO流来进行网络通信

20. 客户端 Socket
    - 创建客户端的Socket对象(Socket)与指定服务的建立
      Socket(Sting host , int port)

    - 获取输出流 写数据
      OutputStream getOutputStream()

    - 释放资源
      void clse() 

21. 服务的 ServerSocket
    - 创建服务器端的Socket对象(Socket)
      Socket(int port)

    - 监听客户端连接 返回一个Socket对象
      Socket accept()
    
    - 获取输入流，读数据，并把数据显示在控制台
      IntputStream getIntputStream()
     
    - 释放资源
      void close();
    
    TCP/IP三次握手四次挥手
    
    ![屏幕截图 2025-08-12 161253](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-12 161253.png)
    
    ![屏幕截图 2025-08-12 161315](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-12 161315.png)

---



## 5.综合练习



---

