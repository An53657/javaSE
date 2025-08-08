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

5. 缓冲流有几种
   - 字节缓冲输入流：BufferedIntputStream
   - 字节缓冲输出流：BufferedoutputStream
   - 字符缓冲输入流：BufferedReader
   - 字符缓冲输出流：Bufferedwriter

6. 缓冲流为什么能提高效率
   - 缓冲流自带长度为8192的缓冲区
      字节缓冲流：缓存区是byte类型的，长度是8k
      字符缓冲流：缓冲区是char类型的，长度是16k

   - 可以显著提高字符流的读写性能
   - 对于字符流提升步明显，对于字符缓冲流而言关键点是两个特有的方法

7. 字符缓冲流特有的方法
    - 字符缓冲输入流BufferedReader:readLine()
    - 字符缓冲输出流BufferedWriter:newLine()

---

---



## 2.转换流



---




## 3.序列化流




---




## 4.打印流




---



## 5.压缩流



---



## 6.Commons-io



---



