/*FileOutStream写数据的三种方式
方法名                                                 说明
void write(int b)                                     一次写一个字节数据
void write(byte[] b)                                  一次写一个字节数组数据
void write(byte[] b , int off , int len)              一次写一个字节数组的部分数据
          byte[] 数组
          int off 指定索引写入
          int len 写入的个数
 */
package Day27.a01bytestreamdemo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo02 {
    public static void main(String[] args) throws IOException {
        // 创建FileOutStrea对象
        FileOutputStream fos = new FileOutputStream("Foundation\\Day27\\a01iostreamdemo01\\a.txt");

        // void write(int b) 一次写一个字节数据
        // fos.write(97);
        // fos.write(98);

        // void write(byte[] b) 一次写一个字节数组数据
        byte[] bytes = { 97, 98, 99, 100, 101 };
        // fos.write(bytes);

        // void write(byte[] b , int off , int len) 一次写一个字节数组的部分数据
        fos.write(bytes, 1, 3);

        fos.close();
    }
}
