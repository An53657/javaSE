/*

16. 构造方法

          构造方法                                                   说明
          public ObjectInputStream(InputStream out)                  把基本流变成高级流

17. 成员方法

          成员方法                                                说明
          public Object readObject()                              把序列化到本地文件中的对象，读取到程序中来
    

 */
package Day28.a03serializedflowdemo03.a01serializedflowdemo01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializedStreamDemo02 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Foundation\\Day28\\a03serializedflowdemo03\\a01serializedflowdemo01\\a.txt"));

        Object o = ois.readObject();

        System.out.println(o);

        ois.close();

    }
}
