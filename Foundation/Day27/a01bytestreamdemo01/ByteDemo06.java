/*练习 文件拷贝 基本代码

 */
package Day27.a01bytestreamdemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteDemo06 {
    public static void main(String[] args) throws IOException {
        // 读
        FileInputStream fis = new FileInputStream("E:\\test\\文件拷贝\\Nvidia RTX 4090.tif");
        // 写
     FileOutputStream fos = new FileOutputStream("Foundation\\Day27\\a01bytestreamdemo01\\a.tif");

        long start = System.currentTimeMillis();

        // 边读边写 循环读写
        int b = 0;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        // 释放资源 先开的流后关
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
