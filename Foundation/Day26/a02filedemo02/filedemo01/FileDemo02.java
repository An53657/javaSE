/*
方法名称                                 说明
public boolean isDirectory()             判断此路径名表示的File是否为文件夹
public boolean isFile()                  判断此路径名表示File是否为文件夹
public boolean exists()                   判断此路径名表示的File是否存在
public long length()                      返回文件的大小(字节数量)
public String getAbssolutePath()          返回文件的绝对路径
public String getPath()                   返回定义文件时使用的路径
public String getName()                   返回文件的名称，带后缀
public long lastMoodified()               返回文件的最后的修改时间(毫秒值)
 */
package Day26.a02filedemo02.filedemo01;

import java.io.File;


public class FileDemo02 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        String str1 = "C:\\Users\\kelly\\Desktop\\test";
        String str2 = "C:\\Users\\kelly\\Desktop\\test\\a.txt.txt";
        String str3 = "d:\\Users\\kelly\\Desktop\\test\\b.txt.txt";
        String str4 = "c:\\Users\\kelly\\Desktop\\test\\b.txt.txt";
        String st5 = "C:\\Users\\kelly\\Desktop\\test\\aaa";
        String str6 = "Foundation\\a.txt";
        // System.out.println("------------------------------------------------------");

        // 创建File对象
        // 文件夹
        File f1 = new File(str1);
        // 文件 a.txt
        File f2 = new File(str2);

        // 不存在的文件
        File f3 = new File(str3);

        // 文件 b.txt
        File f4 = new File(str4);

        // 文件夹
        File f5 = new File(st5);

        //
        File f6 = new File(str6);

        // System.out.println("------------------------------------------------------");

        System.out.println("----------------- 判断此路径名表示File是否为文件夹-------------------------------------");
        // public boolean isDirectory() 判断此路径名表示的File是否为文件夹
        System.out.println("文件夹,test," + "判断此路径名表示的File是否为文件夹     \t : " + f1.isDirectory());
        System.out.println("文件夹,test," + "判断此路径名表示的File是否存在         \t : " + f1.exists());
        System.out.println("------------------------------------------------------");

        System.out.println("------------判断此路径名表示File是否为文件夹------------------------------");
        // public boolean exists() 判断此路径名表示的File是否存在
        System.out.println("文件夹,test," + "判断此路径名表示File是否为文件        \t: " + f1.isFile());
        System.out.println("文件,a.txt" + "判断此路径名表示File是否为文件夹        \t: " + f2.isFile());
        System.out.println("------------------------------------------------------");

        // public boolean exists() 判断此路径名表示的File是否存在
        System.out.println("------------判断此路径名表示的File是否存在------------------------------");
        System.out.println("文件存在,a.txt" + "判断此路径名表示的File是否存在:      \t: " + f2.exists());
        System.out.println("文件不存在,b.txt" + "判断此路径名表示的File是否存在:     \t: " + f3.exists());
        System.out.println("------------------------------------------------------");

        // public long length() 返回文件的大小(字节数量)
        System.out.println("------------返回文件的大小(字节数量)------------------------------");
        // 细节1 这个方法只能获取文件的大写，单位是字节
        // 如果单位我们KB MB G
        // 不断的处1024
        // 细节2 这个方法无法获取文件夹的大小
        // 如果获取文件夹的大小，需要把这个文件夹所有的文件累加在一起
        System.out.println("文件,a.txt" + "判断此路径名表示的File是否存在:           \t: " + f2.length());
        System.out.println("文件不存在,b.txt" + "判断此路径名表示的File是否存在:      \t: " + f4.length());
        System.out.println("文件夹,图片·" + "判断此路径名表示的File是否存在:           \t: " + f5.length());
        System.out.println("------------------------------------------------------");

        System.out.println("----------------------返回文件的绝对路径--------------------------------");
        // public String getAbssolutePath() 返回文件的绝对路径
        System.out.println("文件,a.txt" + "返回文件的绝对路径:           \t: " + f2.getAbsolutePath());
        // 下面写的是相对路径，相对路径是相对当前项目而言的
        // 先找前面的，在找后面的
        // 不管括号里面写的是什么，那么括号里面一定返回的是相对路径
        System.out.println("文件,a.txt" + "返回文件的绝对路径:           \t: " + f6.getAbsolutePath());

        System.out.println("------------------------------------------------------");

        System.out.println("----------------------返回定义文件时使用的路径--------------------------------");
        // 简单来说括号里面写的是什么，返回的就是什么
        // public String getPath() 返回定义文件时使用的路径
        System.out.println("文件,a.txt" + "返回文件的绝对路径:           \t: " + f6.getParent());
        System.out.println("------------------------------------------------------");

        System.out.println("----------------------返回文件的名称，带后缀--------------------------------");
        // 细节1获取文件， 会把文件名和扩展名返回
        // 细节2获取文件夹 会把文件夹名称返回
        System.out.println("文件夹,test," + "返回文件的名称，带后缀:         \t: " + f1.getName());
        System.out.println("文件,a.txt" + "返回文件的名称，带后缀:           \t: " + f2.getName());
        System.out.println("文件不存在,b.txt" + "返回文件的名称，带后缀:      \t: " + f3.getName());
        // public String getName() 返回文件的名称，带后缀
        System.out.println("------------------------------------------------------");

        System.out.println("---------------------- 返回文件的最后的修改时间(毫秒值)--------------------------------");
        // public long lastMoodified() 返回文件的最后的修改时间(毫秒值)
        System.out.println("------------------------------------------------------");
        System.out.println("文件夹,test," + "返回文件的名称，带后缀:         \t: " + f1.lastModified());
        System.out.println("文件,a.txt" + "返回文件的名称，带后缀:           \t: " + f2.lastModified());
        System.out.println("文件不存在,b.txt" + "返回文件的名称，带后缀:      \t: " + f3.lastModified());


    }
}
