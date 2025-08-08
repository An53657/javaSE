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

public class CharStreamDemo02 {
    public static void main(String[] args) throws IOException {
        // 创建FileReader对象
        FileReader fr = new FileReader("Foundation\\Day27\\a02charsetdemo02\\a.txt");

        /*
         * 读取数据 read()
         * 字符流底层也是字节流 默认也是一个字节一个字节读的
         * 如果遇到中文就会一次读多个GBK一次读两个字节，UTF-8一次读三个字节
         * 
         * read() 细节
         * read() 默认也是一个字节一个字节读取的，如果遇到中文就会一次读多个
         * 最终这个十进制作为返回值
         * 这个十进制的数据也表示在字符集上的数字
         */
        // 读取
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print(ch);
        }

        // 关流
        fr.close();
    }
}
