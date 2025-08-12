/*20. 客户端 Socket
    - 创建客户端的Socket对象(Socket)与指定服务的建立
      Socket(Sting host , int port)

    - 获取输出流 写数据
      OutputStream getOutputStream()

    - 释放资源
      void clse() 
 */
package Day31.a04tcpdemo04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo01 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        // 创建客户端的Socket对象(Socket)与指定服务的建立
        // 细节 在创建对象的同时会连接服务器
        // 如果连接不上 直接报错
        Socket socket = new Socket("127.0.0.1", 10086);

        // 获取输出流 写数据
        // 可以从连接通道获取输出流
        OutputStream os = socket.getOutputStream();
        // 写数据
        os.write("11我1".getBytes());

        // 释放资源
        os.close();
        socket.close();

    }
}
