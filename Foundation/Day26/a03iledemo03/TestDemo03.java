/*File相关的API的练习题
需求
    找到的电脑中所有以avi结尾的文件
    (需要考虑子文件夹)

    套路
        进入文件夹
        遍历数组
        判断
        判断
 */
package Day26.a03iledemo03;

import java.io.File;

public class TestDemo03 {
    public static void main(String[] args) {
        File src = new File("c:\\");
        findfile(src);

    }

    public static void findfile() {
        File[] arr = File.listRoots();
        for (File f : arr) {
            findfile(f);
        }
    }

    public static void findfile(File src) {
        // 进入文件夹src
        File[] files = src.listFiles();
        // 非空判断
        if (files != null) {
            // 遍历数组 依次得到src里面每一个文件或者文件夹
            for (File file : files) {
                // 判断如果是一个文件 就执行业务逻辑
                if (file.isFile()) {
                    // 获取名字
                    String name = file.getName();
                    // 判断后缀名
                    if (name.endsWith(".mp4")) {
                        System.out.println(name);
                    }
                } else {
                    // 如果是文件夹就可以有递归
                    findfile(file);
                }
            }
        }
    }
}
