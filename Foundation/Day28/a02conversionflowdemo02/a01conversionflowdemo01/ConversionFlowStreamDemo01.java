/*练习 利用转换流指定编码
//E:\test\gbkfile.txt
 */
package Day28.a02conversionflowdemo02.a01conversionflowdemo01;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConversionFlowStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\test\\gbkfile.txt", Charset.forName("GBK"));

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}
