/*接受数据
    - 找快递公司            创建接受端DatagramSocket对象
    - 接受箱子              接受打包好的数据
    - 从箱子里面获取礼物     解析数据
    - 签收走人              释放资源   

 */
package Day31.a02udpdemo02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReveiceMessagesDemo {
    public static void main(String[] args) throws IOException {
        // 找快递公司 创建接受端DatagramSocket对象
        // 细节
        // 在接受的时候已经要绑定端口
        // 而且绑定端口一定要跟发送端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);

        // 创建箱子
        // 创建字节数组
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        // 接受箱子 接受打包好的数据
        ds.receive(dp);

        // 从箱子里面获取礼物 解析数据
        // 获取数据
        byte[] data = dp.getData();
        // 获取多少个字节数据
        int len = dp.getLength();
        // 是出那台电脑发的
        InetAddress address = dp.getAddress();
        // 是从哪个端口发的
        int prot = dp.getPort();

        // 打印数据
        System.out.println("接受数据" + new String(data, 0, len));
        System.out.println("该数据是从" + address + "这台电脑中端口" + prot + "这个端口发的");

        // 释放资源
        ds.close();
    }
}
