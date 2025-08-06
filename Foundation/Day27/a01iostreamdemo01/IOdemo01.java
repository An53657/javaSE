/*演示：字节输出流FileOutputStream
  实现: 写一段文字到本地文件中(暂时不写中文)

  实现步骤
    1. 创建字节输出流对象
    2. 写数据
    3. 释放资源
 */
package Day27.a01iostreamdemo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOdemo01 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream file = new FileOutputStream("Foundation\\Day27\\a01iostreamdemo01\\a.txt");

        //写出数据
        file.write(97);

        //释放资源
        file.close();

    }
}
