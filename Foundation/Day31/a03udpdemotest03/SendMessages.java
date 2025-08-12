/*练习聊天室
按照下面要完成程序
UDP发送数据 数据来自键盘录入，直到输入886为止发送数据结束
UDP接受数据 因为接受端不知道发送端什么停止发送 故采用死循环

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
 */
package Day31.a03udpdemotest03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendMessages {
    public static void main(String[] args) throws IOException {
        // 创建DatagramSocket
        DatagramSocket ds = new DatagramSocket();

        // 数据打包(DatagramPacket)

        // 数据来自键盘录入，直到输入886为止发送数据结束
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数据");
            String str = sc.nextLine();

            if ("886".equals(str)) {
                sc.close();
                break;
            }

            byte[] bytes = str.getBytes();

            // 指定IP
            InetAddress address = InetAddress.getByName("127.0.0.1");

            // 指定端口号
            int port = 10086;

            // 数据打包(DatagramPacket)
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

            // 发送数据
            ds.send(dp);
        }

        // 释放资源
        ds.close();
    }
}
