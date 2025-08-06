/*File相关的API的练习题
需求
    定义一个方法找某一个文件夹中是否有以avi的结尾的文件
    (暂时不考虑子文件夹)
 */
package Day26.a03filedemo03;

import java.io.File;

public class TestDemo02 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\kelly\\Kelly\\test\\aaa");

        boolean b = haveAVI(file);
        System.out.println(b);
    }

    // 这个方法应用于找后缀名以avi结尾的文件
    // 形参要找的文件
    // 返回值查找的结果 存在返回true 不存在返回false
    public static boolean haveAVI(File file) {
        // 进入文件夹获取所有内容 并以数组的方式返回
        File[] files = file.listFiles();

        // 用增强for遍历files这个数组
        // 遍历数组获取每一个元素
        for (File f : files) {
            /// 判断是不是文件，获取名字后缀名
            if (f.isFile() && f.getName().endsWith(".avi")) {
                // 找到返回true
                return true;
            }
        }
        // 没找到返回false
        return false;
    }
}
