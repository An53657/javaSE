# i0流进阶(二)  io-stream-advanced(二)

---



## 1.缓存流


![缓冲流](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-08 170137.png)

1. 底层原理
   自带了长度为8192的缓存区提高性能

2. 字节缓冲流构造方法

                方法名名                                           说明
                public BufferdInputStream(InputStream is)         把基本流包装成高级流 提高读取数据的性能
                public BufferdOutputStream(outStream os)          把基本流包装成高级流，提高写出性能

3. 字符冲流的构方法

                方法名称                                            说明
                public BufferedReader(Reader r)                    把基本流变成高级流
                public BufferedReader(Write r)                     把基本流变成高级流

4. 字符缓冲流特有方法
   
                字符缓冲输入流特有的方法                             说明
                public String readLine()                           读取一行数据，如果没有数据可读了，方法返回null
                  
                字符缓冲输出流特有方法                               说明
                public newLine()                                    跨平台换行

5. 字符缓冲流：缓冲区是char类型的，长度是16k
   - 可以显著提高字符流的读写性能
   - 对于字符流提升步明显，对于字符缓冲流而言关键点是两个特有的方法
   
7. 字符缓冲流特有的方法
    - 字符缓冲输入流BufferedReader:readLine()
    - 字符缓冲输出流BufferedWriter:newLine()

---

## 2.转换流

---

![转换流体系](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-09 101807.png)

---

8. 转换流
   转换流：是字符流和字节流之间的桥梁

9. 转换流的名字
   - 字符转换输入流：InputStreamReader
   - 字符转换输出流：OutputStreamWriter

10. 转换流的作用
    - 指定字符集读写数据(JDK11之后已淘汰)
    - 字节流想要使用字符流中的方法了，可以使用


---



## 3.序列化流

---

![序列化流体系](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-09 112103.png)


---

11. 序列化流/对象操作输出流
    - 可以把java中的对象写到本地文件中 

12. 构造方法

               构造方法                                     说明
               public ObjectOutputStream(outputStream out)  把基本流变成高级流

13. 成员方法

               成员方法                                        说明
               public finsl void writeObject(Object obj)       把对象序列化(写出)到文件中出

14. 序列化流的细节
    使用对象输出流对象保存到文件时出现NotSerializableException异常

    解决方案
           需要让javabean类实现Serializable接口

15. 反序列化流/对象操作输入流
    可以把序列化到本地文件中的对象，读取到程序中来

16. 构造方法

          构造方法                                                   说明
          public ObjectInputStream(InputStream out)                  把基本流变成高级流

17. 成员方法

          成员方法                                                说明
          public Object readObject()                              把序列化到本地文件中的对象，读取到程序中来
   
18. 序列化流/反序列化流的细节汇总
    
    - 使用序列化流将对象写到文件时，需要让javabean类实现Serializable接口
    否则，会出现NotSerializableExceptiont异常
    
    - 序列化流写到文件中的数据，时不能修改的，一旦修改就无法在次读回了
    
    - 序列化对象后，修改了javabean类，在次反序列化。会有问题吗
      会 会抛出InvalidClassException异常
      解决方案 给javabean类添加SerialVersinUID (序列化 版本号)
    
    - 如果一个对象中某一个成员变量值不想被序列化，如何实现
      解决方案 给该成员变量加transient关键字修饰 该关键字标记的成员变量不参与序列化过程


---



## 4.打印流



![打印流](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-09 152240.png)

19. 打印流的分类
    - 字节打印流 PrintStream
    - 字符打印流 PrintWrite

20. 打印流特点
    - 特点1：打印流只操作文件目的地，不操作数据源
    
    - 特点2：特有的写出方法可实现，数据原样写出

    - 特点3：特有的写出方法，可以实现自动刷新，自动换行

21. 字节打印流构造方法

            构造方法                                                                             说明
            public PrintStream(OutStream/File/String)                                           关联字节输出流/文件/文件路径
            public PrintStream(String fileName , charset charset)                               指定字字符编码
            public PrintStream(OutputStream out , boolean autoFlush)                            自动刷新
            public PrintStream(OutputStream out , boolean autFlush , String encoding)           指定字符编码且自动刷新
            字节打印流是没有缓冲区的，开不开自动刷新都一样

22. 字节打印流的成员方法

            成员方法                                                                              说明
            public void write(int b)                                                             常规方法：规则跟之前一样，将指定的字节写出
            public void prinln(Xxx,xx)                                                           特有方法：打印任意数据，自动刷新，自动换行
            public void print(Xxx xx)                                                            特有方法：打印任意数据，不换行
            public void printf(String format, Object...args)                                      特有方法：带有占位符的打印语句，不换行  


23. 字符打印流构造方法

            构造方法                                                                            说明
            public PrintWrite(write/File/String)                                               关联字节输出流/文件/文件路径
            public PrintWrite(String fileName , charset charset)                               指定字字符编码
            public PrintWrite(Write  w , boolean autoFlush)                                    自动刷新
            public PrintWrite(OutputStream out , boolean autFlush , String encoding)           指定字符编码且自动刷新
            字符流有缓冲区 要手动开启

24. 字符打印流的成员方法

            成员方法                                                                              说明
            public void write(int b)                                                             常规方法：规则跟之前一样，将指定的字节写出
            public void prinln(Xxx,xx)                                                           特有方法：打印任意数据，自动刷新，自动换行
            public void print(Xxx xx)                                                            特有方法：打印任意数据，不换行
            public void printf(String format, Object...args)                                      特有方法：带有占位符的打印语句，不换行  

25. 总结
    1. 打印流有几种，各有什么特点
       - 有字节打印流和字符打印流两种
       - 打印流不操作数据源，只能操作目的地
       - 字节打印流：默认自动刷新，特有的println自动换行
       - 字符打印流：自动刷新需要开启，特有的println自动换行


---

## 5.压缩流

---

![解压缩流](C:\Users\kelly\Pictures\Screenshots\屏幕截图 2025-08-09 183824.png)

---

26. 解压的本质：把每一个zipEntry按照层级拷贝到本地另一个文件夹中
27. 压缩的本质：把每一个(文件/文件夹)看成ZipEntry对象放大压缩包中



---



## 6.Commons-io



---



