/*练习 文件加密
为了保证文件的安全性，就需要对原始文件进行加密存储，在使用的时候在进行解密处理
加密原理：
        对原始文件中的每一个字节进行更改，然后将更改以后的数据存储到新的文件中
解密原理：
        读取加密之后的文件，按照加密规则反向操作，变成原始文件
 */
package Day27.a03testdemo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo02 {
        public static void main(String[] args) throws IOException {
                // 关联原始文件
                FileInputStream fis = new FileInputStream("E:\\test\\dest\\1713106450282.png");
                // 关联加密文件
                FileOutputStream fos = new FileOutputStream("Foundation\\Day27\\a03testdemo03\\a.png");

                int ch;

                while ((ch = fis.read()) != -1) {

                        fos.write(ch ^ 10);
                }

                fos.close();
                fis.close();
        }
}
