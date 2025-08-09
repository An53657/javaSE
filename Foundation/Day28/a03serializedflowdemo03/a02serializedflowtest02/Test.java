package Day28.a03serializedflowdemo03.a02serializedflowtest02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Test {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("Foundation\\Day28\\a03serializedflowdemo03\\a02serializedflowtest02\\a.txt"));

          Object o = ois.readObject();
          System.out.println(o);
        ois.close();
    }
}
