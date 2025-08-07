/*FileInputStream
操作本地文件的字节输入流，可以把本地文件中的数据读取到程序当中
书写步骤
      创建字节输入流
      读取数据
      释放资源

      字节输入流的细节
                    1.创建字节流对象
                            细节：如果文件不存在，直接报错
                                   java为什么会这样设计
                                   输出流：
                                        不存在，就创建
                                        把数据写到文件当中
                                    
                                    输入流：
                                          不存在，直接变报错
                                          因为创建出来的文件是没有数据的，没有任何意义
                                          所以java就没有设计这种无意义的逻辑，文件不存在直接变成

                                          程序中最重要的是 数据
                    
                    2.写数据
                            细节1:一次读一个字节，读出来的数据在ASCII码表上对应的数字
                            细节2：读到文件末尾了 read方法返回-1
                     
                    3.释放资源
                            细节：每次使用完流之后都需要释放资源


 */
package Day27.a01bytestreamdemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo04 {
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
