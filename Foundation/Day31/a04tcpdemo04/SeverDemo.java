/*21. 服务的 ServerSocket
    - 创建服务器端的Socket对象(Socket)
      Socket(int port)

    - 监听客户端连接 返回一个Socket对象
      Socket accept()
    
    - 获取输入流，读数据，并把数据显示在控制台
      IntputStream getIntputStream()
   
    - 释放资源
      void close();
 */
package Day31.a04tcpdemo04;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDemo {

    public static void main(String[] args) throws IOException {
        // 1.创建服务器端的Socket对象(Socket)
        ServerSocket ss = new ServerSocket(10086);

        // 2.监听客户端连接 返回一个Socket对象 Socket accept()
        Socket socket = ss.accept();

        // 3.获取输入流，读数据，并把数据显示在控制台
        // 从连接通道中或是输出流获取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        // 循环读取
        int b;
        while ((b = isr.read()) != -1) {
            System.out.println((char) b);
        }

        // 释放资源
        ss.close();

    }
}
