/*练习
利用字节流读取文件中的数据 每次读一整行 不能用乱码  
 */
package Day28.a02conversionflowdemo02.a02conversionflowtest02;


import java.io.BufferedReader;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class ConversionFlowStreamDemo04 {
    public static void main(String[] args) throws IOException {
        // FileInputStream fis = new FileInputStream("E:\\test\\csb.txt");
        // InputStreamReader isr = new InputStreamReader(fis);
        // BufferedReader br = new BufferedReader(isr);

        // String str = br.readLine();
        // System.out.println(str);
        // br.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\test\\csb.txt")));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

    }
}
