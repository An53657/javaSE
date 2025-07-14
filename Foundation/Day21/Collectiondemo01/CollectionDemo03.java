/*利用增强for循环进行遍历集合
增强for 格式
    for(元素的数据类型 : 数组或集合){
        方法体；
    }*/

package Day21.Collectiondemo01;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03 {
    public static void main(String[] args) {
        // 创建集合
        Collection<String> coll = new ArrayList<>();

        // 添加元素
        coll.add("AAA");
        coll.add("bbb");
        coll.add("mmm");

        // 利用增强for循环进行遍历
        for (String s : coll) {
            // 注意点
            // s就是第三方变量 在循环的过程中依次表示集合中的每一个元素
            System.out.println(s);
        }

    }
}
