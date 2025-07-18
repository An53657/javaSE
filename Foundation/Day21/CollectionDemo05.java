/*
方法名            说明、
void add (int indx, E element)          在此集合中的指定位置插入指定元素
E remove (int index)                    删除指定索引处的元素
E set (int,index,E element)             修改指定索引处的元素，返回被修改的元素
E get (int index)                       返回指定索引元素

 */
package Day21;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo05 {
    public static void main(String[] args) {
        // 创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("nnn");
        list.add("lll");

        // void add (int indx, E element) 在此集合中的指定位置插入指定元素
        //在添加的过程中，原来的索引上的元素依次往后移
        list.add(0, "mmm");
        System.out.println(list);

        // E remove (int index) 删除指定索引处的元素
        list.remove(1);
        System.out.println(list);

        boolean result = list.remove("lll");
        System.out.println(result);
        System.out.println("---------------------------------");

        // E set (int,index,E element) 修改指定索引处的元素，返回被修改的元素
        String result1 = list.set(0, "kkk");
        System.out.println(result1);

        // E get (int index) 返回指定索引元素
        String result2 = list.get(0);
        System.out.println(result2);

    }
}
