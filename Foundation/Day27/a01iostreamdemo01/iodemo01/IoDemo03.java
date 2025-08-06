/*FileOutputStream写出数据的两个小问题
换行写，追加写

    换行写
         在次写出一个换行符就可以了
         windows: \r\n
         linux:   \n
         Mac：     \r

         细节：
             在windows 存在系统中，java在回车换行进行了优化
             虽然完整的是\r\n 但是我们可以写其中的一个\r或者\n
             java也可以实现换行，java底层会补全

             建议
                不要省略， 要写全
    
                续写
                   如果要续写 打开续写开关即可
                   开关位置：创建对象的第二个参数
                   默认false： 表示关闭续写，此时创建对象会清空文件
                   手动传递true: 表示打开续写，此时创建对象不会清空文件


 */
package Day27.a01iostreamdemo01.iodemo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class IoDemo03 {
    public static void main(String[] args) throws IOException {
        // 创建FileOutputStream对象
        FileOutputStream fos = new FileOutputStream("Foundation\\Day27\\a01iostreamdemo01\\a.txt", true);

        // 写数据
        String str1 = "Kelly";
        byte[] byte1 = str1.getBytes();
        fos.write(byte1);

        String str2 = "\r\n";
        byte[] warp = str2.getBytes();
        fos.write(warp);

        String str3 = "is,goood";
        byte[] byte2 = str3.getBytes();
        fos.write(byte2);

        String str4 = "777";
        byte[] byte3 = str4.getBytes();
        fos.write(byte3);

        // 释放资源
        fos.close();

    }
}
