/*

21. 字节打印流构造方法

            构造方法                                                                             说明
            public PrintStream(OutStream/File/String)                                           关联字节输出流/文件/文件路径
            public PrintStream(String fileName , charset charset)                               指定字字符编码
            public PrintStream(OutputStream out , boolean autoFlush)                            自动刷新
            public PrintStream(OutputStream out , boolean autFlush , String encoding)           指定字符编码且自动刷新
            字节打印流是没有缓冲区的，开不开自动刷新都一样

22. 字节打印流的成员方法

            成员方法                                                                              说明
            public void write(int b)                                                             常规方法：规则跟之前一样，将指定的字节写出
            public void prinln(Xxx,xx)                                                           特有方法：打印任意数据，自动刷新，自动换行
            public void print(Xxx xx)                                                            特有方法：打印任意数据，不换行
            public void printf(String format, Object...args)                                      特有方法：带有占位符的打印语句，不换行  


 */
package Day28.a04printflowdemo04.a01byteprintflowdemo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class BytePrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(
                new FileOutputStream("Foundation\\Day28\\a04printflowdemo04\\printstreamdemo01\\a.txt"), true,
                Charset.forName("UTF-8"));

                ps.println("你好");
                ps.println(123);
                ps.println(123);

                ps.close();
    }
}
