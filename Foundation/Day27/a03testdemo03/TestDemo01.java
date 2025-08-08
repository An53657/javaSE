/*练习 拷贝
需求：
    拷贝一个文件夹 考虑子文件夹
 */
package Day27.a03testdemo03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo01 {
    public static void main(String[] args) throws IOException {
        // 数据源
        File src = new File("E:\\test\\aaa");
        // 目的地
        File dest = new File("E:\\test\\dest");

        copydest(src, dest);
    }

    public static void copydest(File src, File dest) throws IOException {
        dest.mkdirs();
        // 递归
        // 进入数据源
        File[] files = src.listFiles();
        // 遍历数组
        for (File file : files) {
            // 判断文件
            if (file.isFile()) {
                // 拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                int len;
                byte[] bytes = new byte[1024 * 1024 * 10];
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }

                fos.close();
                fis.close();
            } else {
                //// 判断文件夹 就用递归
                copydest(src, new File(dest, file.getName()));
            }
        }
    }
}
