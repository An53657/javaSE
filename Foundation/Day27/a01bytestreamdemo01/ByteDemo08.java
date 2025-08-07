/*一次读多个数据
 */
package Day27.a01bytestreamdemo01;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteDemo08 {
    public static void main(String[] args) throws IOException {
        // 读
        FileInputStream file = new FileInputStream("Foundation\\Day27\\a01bytestreamdemo01\\ByteDemo08.java");

        // 创建数组
        byte[] byte1 = new byte[2];

        // 一次读取多个字节数据 具体读取多少 跟数组长度有关
        // 返回值 本次读取多少个字节设数据
        int len1 = file.read(byte1);
        System.out.println(len1);
        String str1 = new String(byte1, 0, len1);
        System.out.println(str1);

        int len2 = file.read(byte1);
        System.out.println(len2);
        String str2 = new String(byte1);
        System.out.println(str2);

        // 释放资源
        file.close();
    }
}