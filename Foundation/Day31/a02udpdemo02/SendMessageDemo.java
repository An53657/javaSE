/*UDP协议发送数据
16. UDP通信程序(发送数据)
    - 找快递公司           创建发生端口的DatagramSocket对象
    - 打包礼物             数据打包(DatagramPacket)
    - 快递公司发送包裹      发送数据
    - 付钱走人             释放资源

    DatagramPacket()参数细节
    byte[] buf int offset,int length 表示要要出的的数据 类型是字节数组 可以指定从哪个索引发 一共要发几个
    IntAddress address               表示要给那台电脑上发 指定IP 
    int prot                         表示要发给这台电脑的哪个端口上
 */
package Day31.a02udpdemo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        // 创建发生端口的DatagramSocket对象(快递公司)
        // 细节
        // 绑定端口发送是往这个端口发的
        // 空参：所有可有的端口中随机一个进行使用
        // 有参：指定端口绑定
        DatagramSocket ds = new DatagramSocket();

        // 打包礼物 数据打包(DatagramPacket)
        // 发送数据转成字节数组
        String str = "111";
        byte[] bytes = str.getBytes();

        // 指定发送IP/指定电脑
        InetAddress address = InetAddress.getByName("127.0.0.1");

        // 指定渡口
        int port = 10086;

        // 表示把字节数组里面的所有数据都发送出去，要往address这台电脑上发，发到port这个端口上
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        // - 快递公司发送包裹 发送数据
        ds.send(dp);

        // - 快递公司发送包裹 发送数据
        ds.close();

    }
}
