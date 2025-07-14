/* 
方法名                            说明
public boolean add(E e)           把给定的对象添加到当前集合中
public void clear()               清空集合中的所有元素
public boolean remove(E e)        把给定的对象在当前的集合中删除
public boolean contaisn(Object obj) 判断集合中是否包括给定对象
public boolean isEmpty()            判断当前集合是否为空
public int size                     返回集合中元素的个数/集合的长度*/
package Day21.Collectiondemo01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {

        // 注意
        // Collection是一个接口，不能直接创建对象，
        // 所以，只能创建它的实现类对象
        Collection<String> coll = new ArrayList<>();

        // public boolean add(E e) 把给定的对象添加到当前集合中
        // 细节1 如果要往List系列集合中添加数据，那么丰富永远一直返回true，
        // 细节2 如果要往Set系列集合中易添加数据，如果当前添加元素不存在，方法返回true 表示添加成功，
        // 如果当前添加的元素已存在，方法返回false 表示添加失败
        // 因为Set集合不允许吃饭
        coll.add("zz");
        coll.add("XX");
        System.out.println(coll);

        // public void clear()
        // 清空集合中的所有元素
        // coll.clear();
        // System.out.println(coll);

        // public boolean remove(E e)
        // 把给定的对象在当前的集合中删除

        // 细节1 因为Collection里面定义了共性的方法 此时不能通过索引进行删除 只能通过元素对象进行删除
        // 细节2 方法会有布尔类型的返回值，删除成功返回tre 删除失败返回false
        // 如果要删除的元素不存在，就会删除失败
        boolean result = coll.remove("zz");
        System.out.println(result);

        // public boolean contaisn(Object obj)
        // 判断集合中是否包括给定对象

        // 细节 底层依赖equals方法进行判断是否存在
        // 所应，如果集合中存储的是自定义对象，也想通过Colletions方法来判断是否存在，
        // 那么在javabean类中，就要重写eauals方法
        boolean c = coll.contains("xx");
        System.out.println(c);

        // public boolean isEmpty()
        // 判断当前集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

        // public int size
        // 返回集合中元素的个数/集合的长度*/
        int size = coll.size();
        System.out.println(size);

    }
}
