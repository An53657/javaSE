/*IntAddress
static IntAddress getByName(String name) 确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
String getHostname()                      获取IP地址主机名
String getHostAdress                      返回文本显示中的IP地址字符串


 */
package Day31.a01ipdemo01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        // static IntAddress getByName(String name) 确定主机名称的IP地址，主机名称可以是机器名称，也可以是IP地址
        InetAddress address = InetAddress.getByName("Kelly-Computer");
        System.out.println(address);

        // String getHostname() 获取IP地址主机名
        System.out.println(address.getHostName());

        // String getHostAdress 返回文本显示中的IP地址字符串

        System.out.println(address.getHostAddress());
    }
}
