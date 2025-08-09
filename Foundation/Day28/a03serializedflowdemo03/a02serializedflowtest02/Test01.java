/*练习 用对象流读写多个对象
需求 
    将多个自定义对象序列化到文件中 但是由于序列化个数不确定 反序列流怎么写
 */
package Day28.a03serializedflowdemo03.a02serializedflowtest02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;;

public class Test01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Student s1 = new Student("zhangsan", 23, "南京");
        Student s2 = new Student("lisi", 24, "浙江");
        Student s3 = new Student("wanwu", 25, "北京");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oop = new ObjectOutputStream(
                new FileOutputStream("Foundation/Day28/a03serializedflowdemo03/a02serializedflowtest02/a.txt"));

        oop.writeObject(list);

        oop.close();
    }
}
