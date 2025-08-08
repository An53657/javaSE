/*练习 利用字节缓冲流拷贝数据 一次读写多个字节
 方法名                                           说明
 public BufferdInputStream(InputStream is)        把基本流包装成高级流 提高读取数据的性能
 public BufferdOutputStream(outStream os)          把基本流包装成高级流，提高写出性能

 */
package Day28.a01bufferflowdemo01.a01bytebufferstreamdemo01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteBufferStreanDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\test\\eee\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("Foundation/Day28/a01bufferflowdemo01/a01bytebufferstreamdemo01/b.txt"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }
}