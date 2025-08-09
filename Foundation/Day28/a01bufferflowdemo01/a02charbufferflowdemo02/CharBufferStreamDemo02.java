/*字符缓冲输出流
public BufferedReader(Write r)                     把基本流变成高级流

//特有方法
public newLine()                                    跨平台换行
 */
package Day28.a01bufferflowdemo01.a02charbufferflowdemo02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharBufferStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("Foundation\\Day28\\a01bufferflowdemo01\\a02charbufferstreamdemo02\\a.txt"));

        bw.write("abc");
        bw.newLine();

        bw.write("srt");
        bw.newLine();

        bw.close();

    }
}
