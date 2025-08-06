/*File相关的API的练习题
需求 
    删除一个多级文件夹

    如果要删除一个多级文件夹
    先删除文件夹里面的所有内容
    在删除自己
 */
package Day26.a03filedemo03;

import java.io.File;

public class TestDemo04 {
    public static void main(String[] args) {
        File file = new File("E:\\test\\aaa");

        delete(file);
    }

    public static void delete(File src) {
        // 进入文件夹
        File[] files = src.listFiles();

        // 非空判断
        if (files != null) {
            // 遍历数组
            for (File file : files) {
                // 判断如果是文件 删除
                if (file.isFile()) {
                    file.delete();
                } else {
                    delete(file);
                }
            }
            src.delete();
        }
    }

    public static void deleteFile(File src) {
        // 进入文件夹
        File[] files = src.listFiles();

        if (files != null) {
            // 遍历文件
            for (File file : files) {
                // 判断 如果是文件 删除·
                if (file.isFile()) {
                    file.delete();
                } else {
                    // 判断
                    deleteFile(file);
                }
            }
            src.delete();
        }

    }
}
