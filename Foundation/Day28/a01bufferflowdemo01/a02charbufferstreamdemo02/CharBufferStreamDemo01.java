/*字符缓冲输入流
public BufferedReader(Reader r)                    把基本流变成高级流

//特有方法
public String readLine()                           读取一行数据，如果没有数据可读了，方法返回null
 */
package Day28.a01bufferflowdemo01.a02charbufferstreamdemo02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharBufferStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\test\\eee\\a.txt"));

        // // 一次读一整行
        // String str1 = bw.readLine();
        // System.out.println(str1);

        // String str2 = bw.readLine();
        // System.out.println(str2);

        // 用循环读
        String b;
        while ((b = br.readLine()) != null) {
            System.out.println(b);
        }

        br.close();

    }
}
