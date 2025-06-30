
package Day11.listdemo;

//导入集合
import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {

        // 创建集合
        // 怎么限定数据类型呢？
        // 泛型：限定集合存储的数据类型

        // JDK7以前的写法
        // ArrayList<E> <>:泛型就写里面的数据类型就行
        // 现在就表示创建了集合，里面自能存String字符串，其他的东西就不能存了

        // JDK7以后的写法：
        // ArrayList<String> list = new ArrayList<String>();
        // System.out.println(list);
        // 后面的<>里面的泛型可以不写，但<>要写

        // 注意！！！！
        // 此时创建的的是ArrayList集合对象，二ArrayList是java已经写好的类
        // 这个类在底层做了一些处理
        // 打印对象不是地址值，而是集合中存储数据内容
        // 在展示的时候会拿着[]把所有的数据进行包裹

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
    }
}