/*
19. FileReader
 第一步：创建字符输入流对象

          方法名                              说明
          public FileReader(File file)        创建字符输入流关联本地文件
          public FileReader(String pathname)   创建字符输入流关联本地文件

          细节：如果文件不存在，就直接变成
 
 第二步：读取数据

          成员方法                                 说明
          public int read()                       读取数据，读到末尾返回-1
          public int read(char[] buffer)          读取多个数据，读到末尾返回-1

          细节1：按字节进行读取，遇到中文，一次读多个字节，返回一个整数
          细节2：读到文件末尾了，read方法返回-1
 
 第三步： 释放资源

          成员方法                                  说明
          public int close()                        释放资源/关流

 */
package Day27.a02charstreamdemo02;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Foundation\\Day27\\a02charsetdemo02\\a.txt");

        // read(char) 读取数据，解码 ，强转三步合并了 把强转之后的字符放到数组当中
        // 相当于空参read() + 强制类型转换
        char[] chars = new char[4];
        int len;
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));

        }

        fr.close();

    }
}
