/*java的编码解码的方法

java中编码的方法

 String类中的方法                               说明
 public byte[] getByte()                       使用默认方式进行编码
 public byte[] getByte(String charsetName)     使用指定方式进行编码

 jaa中解码的方法

 String类中的方法                                说明
 public(byte[] bytes)                           使用默认方式进行解码
 String(byte[] bytes , String charsetName)      使用指定方式进行解
 */
package Day27.a02charsetdemo02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str1 = "a 啊";
        // public byte[] getByte() 使用默认方式进行编码
        byte[] byte1 = str1.getBytes();
        System.out.println(Arrays.toString(byte1));

        // public byte[] getByte(String charsetName) 使用指定方式进行编码
        byte[] byte2 = str1.getBytes("Unicode");
        System.out.println(Arrays.toString(byte2));

        // public(byte[] bytes) 使用默认方式进行解码
        String str3 = new String(byte1);
        System.out.println(str3);

        // String(byte[] bytes , String charsetName) 使用指定方式进行解
        String str4 = new String(byte1, "Unicode");
        System.out.println(str4);

    }
}
