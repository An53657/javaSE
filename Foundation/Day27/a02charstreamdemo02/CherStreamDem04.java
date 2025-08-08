/* 
20. FileWriter构造方法
    
               构造方法                                                说明
               public FileWriter(File file)                           创建字符输出流关联本地文件
               public FileWriter(String pathname)                     创建字符输出流关联本地文件
               public FileWriter(File file , boolean append)          创建字符输出流关联本地文件，打开续写
               public FileWriter(String pathname , boolean append)    创建字符输出流关联本地文件，打开续写

21. FileWriter成员方法
               
               成员方法                                                说明
               void writer(int c)                                     写出一个字符
               void writer(String str)                                写出一个字符串
               void writer(String str , int off , int len)            写出字符串的一部分
               void writer(char[] cbuf)                               写出一个字符数组
               void writer(char[] cbuf , int off , int len)           写出字符数组的一部分
*/
package Day27.a02charstreamdemo02;

import java.io.FileWriter;
import java.io.IOException;

public class CherStreamDem04 {
    public static void main(String[] args) throws IOException {
        // public FileWriter(String pathname) 创建字符输出流关联本地文件
        FileWriter fw = new FileWriter(
                "C:\\Users\\kelly\\Kelly\\01-工作文件\\00-Develop\\javaSE\\Foundation\\Day27\\a02charstreamdemo02\\a.txt");

        // public FileWriter(String pathname) 创建字符输出流关联本地文件
        // FileWriter fw2 = new FileWriter(new
        // File("\"C:\\\\Users\\\\kelly\\\\Kelly\\\\01-工作文件\\\\00-Develop\\\\javaSE\\\\Foundation\\\\Day27\\\\a02charstreamdemo02\\\\a.txt\""));

        // void writer(int c) 写出一个字符
        // fw.write(25105);

        // void writer(String str) 写出一个字符串
        String str = "蔚蓝档案ty5?";
        // fw.write(str);

        // void writer(String str , int off , int len) 写出字符串的一部分
        fw.write(str, 0, 2);

        // void writer(char[] cbuf) 写出一个字符数组

        fw.close();
    }
}
