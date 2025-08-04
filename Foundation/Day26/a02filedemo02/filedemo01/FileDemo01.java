/*
方法名称                                  说明
public File(String pathname)             根据文件路径创建文件对象
public File(string parent, String child) 根据父路径名字字符串和子路径字符串创建文件对象
public File(File parent, String child)   根据父路径对应文件对象和子路径名字字符串创建文件对象
 */
package Day26.a02filedemo02.filedemo01;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        // public File(String pathname) 根据文件路径创建文件对象
        String str = "C:\\Users\\kelly\\Desktop\\a.txt";
        // 创建file类
        File f = new File(str);
        System.out.println(f);

        // public File(string parent, String child) 根据父路径名字字符串和子路径字符串创建文件对象
        String parent = "C:\\\\Users\\\\kelly\\\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        File f3 = new File(parent + "\\" + child);
        System.out.println(f3);

        // public File(File parent, String child) 根据父路径对应文件对象和子路径名字字符串创建文件对象
        File parent2 = new File("C:\\Users\\\\\\\\kelly\\Desktop");
        String clind2 = "a.txt";
        File f4 = new File(parent2, clind2);
        System.out.println(f4);

        System.out.println("------------------------------------------------");

        String parent3 = "C:\\\\Users\\\\kelly\\\\Desktop\\\\a2.txt";
        File f5 = new File(parent3);
        System.out.println(f5);

    }
}
