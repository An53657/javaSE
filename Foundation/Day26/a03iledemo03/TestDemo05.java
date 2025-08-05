/*File相关的API的练习题
需求 
     统计一个文件夹的大小
 
 */
package Day26.a03iledemo03;

import java.io.File;

public class TestDemo05 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kelly\\Kelly\\00-个人文件\\00-图片\\01-影视飓风-芯片图");

        System.out.println(getFile(file) / 1024 / 1024 / 1024);
    }

    public static long getFile(File src) {
        // 定义一个变量，用于累加
        long len = 0;
        // 进入文件夹
        File[] files = src.listFiles();

        // 遍历数组
        for (File file : files) {
            // 判断如果是文件 自己累加
            if (file.isFile()) {
                len = len + file.length();
            } else {
                getFile(file);
            }

        }
        return len;
    }
}
