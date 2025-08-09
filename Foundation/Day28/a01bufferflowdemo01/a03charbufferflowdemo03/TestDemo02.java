/*练习 修改文本顺序
需求：把《出师表》的文章顺序进行恢复到一个新文件中
 */
package Day28.a01bufferflowdemo01.a03charbufferflowdemo03;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TestDemo02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("E:\\test\\eee\\csb.txt"));
        
        ArrayList<String> list = new ArrayList<>();
        String line ;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        list.forEach(s -> System.out.println(s));
    }
}
