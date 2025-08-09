/*
23. 字符打印流构造方法

            构造方法                                                                            说明
            public PrintWrite(write/File/String)                                               关联字节输出流/文件/文件路径
            public PrintWrite(String fileName , charset charset)                               指定字字符编码
            public PrintWrite(Write  w , boolean autoFlush)                                    自动刷新
            public PrintWrite(OutputStream out , boolean autFlush , String encoding)           指定字符编码且自动刷新
            字符流有缓冲区 要手动开启

24. 字符打印流的成员方法

            成员方法                                                                              说明
            public void write(int b)                                                             常规方法：规则跟之前一样，将指定的字节写出
            public void prinln(Xxx,xx)                                                           特有方法：打印任意数据，自动刷新，自动换行
            public void print(Xxx xx)                                                            特有方法：打印任意数据，不换行
            public void printf(String format, Object...args)                                      特有方法：带有占位符的打印语句，不换行  

 */
package Day28.a04printflowdemo04.a02charprintflowdemo02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharPrintStreamDemo01 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(
                new FileWriter("Foundation\\Day28\\a04printflowdemo04\\a02charprintflowdemo02\\a.txt"), true);

        pw.println("123");
        pw.println("456");
        pw.print(789);

        pw.close();
    }
}
