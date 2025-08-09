/*练习
利用转换流按照指定编码写出
 */
package Day28.a02conversionflowdemo02.a02conversionflowtest02;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConversionFlowStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Foundation\\Day28\\a02conversionflowdemo02\\conversionflowdemo01\\a.txt",
                Charset.forName("GBK"));
        fw.write("你好");
        fw.close();
    }
}
