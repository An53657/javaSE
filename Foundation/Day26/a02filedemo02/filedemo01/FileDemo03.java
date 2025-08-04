/*
方法名称                                              说明
public boolean createNewFile()                        创建一个新的空的文件
public boolean mkdir()                                创建单级文件夹
public boolesn mkdirs()                               创建多级文件夹
public boolean delete()                               删除文件，空文件夹
 */
package Day26.a02filedemo02.filedemo01;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        // 创建File
        System.out.println("------------------------创建一个新的空的文件----------------------------------------");
        // public boolean createNewFile() 创建一个新的空的文件
        // 细节1 如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        // 如果当前路径表示的文件是存在的，则创建失败，方法返回false
        // 细节2 如果父级路径是不存在的，那么方法会有异常IOException
        // 细节3 createNewFile创建的一定是文件，如果路径中不包括后缀名，则创建一个没有后缀名的文件
        File f1 = new File("C:\\Users\\kelly\\Desktop\\test\\1");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        System.out.println("------------------------创建单级文件夹----------------------------------------");
        // public boolean mkdir() 创建单级文件夹
        // mkdir make directory 文件夹（目录）
        // 细节1 windows当前路径是唯一的，如果当前路径已存在，则创建失败，方法返回false
        // 细节2 mkdir方法只能创建单级文件夹，无法创建多级文件夹
        File f2 = new File("C:\\Users\\kelly\\Desktop\\test\\fff");
        boolean b2 = f2.mkdir();
        System.out.println(b2);

        System.out.println("------------------------创建多级文件夹----------------------------------------");
        // public boolesn mkdirs() 创建多级文件夹
        // 即可以创建单级的，又可以创建多级文件夹
        File f3 = new File("C:\\Users\\kelly\\Desktop\\test\\aaa\\bbb\\ccc\\");
        boolean b3 = f3.mkdirs();
        System.out.println(b3);

        System.out.println("------------------------创建多级文件夹----------------------------------------");
        // public boolean delete() 删除文件，空文件夹
        // 细节
        // 如果删除的是文件，则直接删除 不走回收站
        // 如果删除的是空文件夹，则直接删 不走回收站
        // 如果删除的是有内容的文件，则删除失败
        File f4 = new File("C:\\Users\\kelly\\Desktop\\test\\bbb");
        boolean b4 = f4.delete();
        System.out.println(b4);

    }
}
