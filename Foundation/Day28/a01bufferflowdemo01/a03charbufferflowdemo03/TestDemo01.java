/*练习 文件拷贝
四种方式拷贝文件，并统计各自的用时
1.字节流的基本流：一次读写一个字节
2.字节流的基本流：一次读写多个字节
3.字节缓存流    : 一次读写一个字节
4.字节缓存流    ：一次读写多个字节

 */
package Day28.a01bufferflowdemo01.a03charbufferflowdemo03;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo01 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // method1();
        // method2();
        method3();
        // method4();

        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000.0);

    }

    public static void method1() throws IOException {
        // 1.字节流的基本流：一次读写一个字节
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\kelly\\Kelly\\06-数据备份\\01-系统备份\\Win11_24H2_Chinese_Simplified_x64.iso");
        FileOutputStream fos = new FileOutputStream("Foundation\\Day28\\a01bufferflowdemo01\\a03testdemo01\\copy2.iso");

        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        // 1.字节流的基本流：一次读写一个字节
        FileInputStream fis = new FileInputStream(
                "C:\\Users\\kelly\\Kelly\\06-数据备份\\01-系统备份\\Win11_24H2_Chinese_Simplified_x64.iso");
        FileOutputStream fos = new FileOutputStream("Foundation\\Day28\\a01bufferflowdemo01\\a03testdemo03\\copy2.iso");

        byte[] bytes = new byte[8192];
        int b;
        while ((b = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, b);
        }

        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "C:\\Users\\kelly\\Kelly\\06-数据备份\\01-系统备份\\Win11_24H2_Chinese_Simplified_x64.iso"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("Foundation\\Day28\\a01bufferflowdemo01\\a03testdemo03\\copy3.iso"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
                "C:\\Users\\kelly\\Kelly\\06-数据备份\\01-系统备份\\Win11_24H2_Chinese_Simplified_x64.iso"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("Foundation\\Day28\\a01bufferflowdemo01\\a03testdemo03\\copy4.iso"));

        byte[] bytes = new byte[8192];
        int len;

        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
