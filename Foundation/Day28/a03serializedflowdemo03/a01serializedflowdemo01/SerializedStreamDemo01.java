/*序列化流
12. 构造方法

               构造方法                                     说明
               public ObjectOutputStream(outputStream out)  把基本流变成高级流

13. 成员方法

               成员方法                                        说明
               public finsl void writeObject(Object obj)       把对象序列化(写出)到文件中出

 */
package Day28.a03serializedflowdemo03.a01serializedflowdemo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializedStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // 创建序列化对象
        ObjectOutput oop = new ObjectOutputStream(
                new FileOutputStream("Foundation\\Day28\\a03serializedflowdemo03\\a01serializedflowdemo01\\a.txt"));

        // 创建对象
        Student stu = new Student("zhangsan", 23,"ll");

        oop.writeObject(stu);

        oop.close();
    }
}
