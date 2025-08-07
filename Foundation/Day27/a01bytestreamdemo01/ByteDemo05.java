package Day27.a01bytestreamdemo01;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteDemo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("Foundation\\Day27\\a01iostreamdemo01\\iodemo02\\a.txt");

        // 循环读取
        int b = 0;
        while ((b = file.read()) != -1) {
            System.out.println((char) b);
        }
        // 释放资源
        file.close();
    }
}
