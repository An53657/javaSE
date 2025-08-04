/*File常见的成员方法(获取并遍历)
方法名称                                                说明
public File[] listFile[]                               获取当前该路径下所有内容
当调用者File表示的路径不存在时，返回null
当调用者File表示的路径时文件时，返回null
当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
当调用者File表示的路径是一个内容的文件夹是，将里面所有文件和文件夹的路径放在File数组中返回
当调用者File表示的路径是一个有隐藏文件的文件夹时,将里面的所有文件和文件夹的路径放在File数组中并返回
当调用者File表示的路径需要权限才能访问的文件夹时，返回null
*/
package Day26.a02filedemo02.filedemo01;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\kelly\\Desktop\\test");
        // public File[] listFile9[] 获取当前该路径下所有内容
        File[] file = f1.listFiles();
        for (File f : file) {
            System.out.println(f);
        }

    }
}
