/*一次读写多个字节

 */
package Day27.a01bytestreamdemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo07 {
    public static void main(String[] args) throws IOException {

        // 读
        FileInputStream fis = new FileInputStream("E:\\test\\文件拷贝\\Nvidia RTX 4090.tif");
        // 写
        FileOutputStream fos = new FileOutputStream("Foundation\\Day27\\a01bytestreamdemo01\\a.tif");

        long start = System.currentTimeMillis();

        // 一次读写多个数据
        int len;
        byte[] byte1 = new byte[1024 * 1024 * 5];

        while ((len = fis.read(byte1)) != -1) {
            fos.write(byte1, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
