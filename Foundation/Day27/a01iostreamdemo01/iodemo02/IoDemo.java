/*FileInputStream
操作本地文件的字节输入流，可以把本地文件中的数据读取到程序当中
书写步骤
      创建字节输入流
      读取数据
      释放资源

 */
package Day27.a01iostreamdemo01.iodemo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fox = new FileOutputStream("Foundation\\Day27\\a01iostreamdemo01\\iodemo02\\a.txt");
        FileInputStream file = new FileInputStream("Foundation\\Day27\\a01iostreamdemo01\\iodemo02\\a.txt");

        // 写入数据
        String str1 = "abc";
        // 变成字节数组
        byte[] byte1 = str1.getBytes();
        fox.write(byte1);

        String str2 = "\r\n";
        byte[] warp = str2.getBytes();
        fox.write(warp);

        String str3 = "bcd";
        byte[] byte3 = str3.getBytes();
        fox.write(byte3);

        // 释放资源
        fox.close();

        // 读取数据
        int i1 = file.read();
        // 读取并强转
        System.out.println((char) i1);

        int i2 = file.read();
        System.out.println((char) i2);

        file.close();

    }
}
