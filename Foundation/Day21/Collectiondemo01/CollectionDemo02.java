/*
 迭代器遍历：迭代器在Java的类是Iterator,迭代器是集合通用遍历方式

Collection集合获取迭代器
方法 名                               说明
Iterator<E> iterator()                返回迭代器对象 默认指向当前集合的0索引

Iterator中的常用方法
方法名                                说明
boolean hasNext()                     判断当前位置是否有元素 有元素返回true 没元素返回false
E next ()                             获取当前位置元素，并将迭代器对象移向下一个位置
     
 */
package Day21.Collectiondemo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo02 {
    public static void main(String[] args) {
        // 创建集合
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        System.out.println(coll);

        // 获取迭代器对象
        // 迭代器就好比是一个指针，默认指向0索引处
        Iterator<String> it = coll.iterator();
        // 利用循环不断获取集合的中的每一个元素
        while (it.hasNext()) {
            // next两件事 获取元素并移动指针
            String result = it.next();
            System.out.println(result);
        }
    }
}
