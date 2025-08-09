/*练习
将本地文件GBK 转成UTF-8
 */
package Day28.a02conversionflowdemo02.a02conversionflowtest02;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConversionFlowStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\test\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("Foundation\\Day28\\a02conversionflowdemo02\\conversionflowdemo01\\a.txt",
                Charset.forName("UTF-8"));

                int ch ;
                while ((ch = fr.read()) != -1) {
                    fw.write((char)ch);
                }

        fw.close();
        fr.close();
                
    }
}
