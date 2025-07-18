/* 
方法名                                                   说明
default void forEach(Consumer< ? Super T > action );    结合Lambda遍历集合
 */
package Day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo04 {
    public static void main(String[] args) {
        // 用lambda表达式来获取元素
        Collection<String> coll = new ArrayList<>();

        coll.add("qq");
        coll.add("nn");
        coll.add("ll");

        // 利用内部类
        // 底层原理
        // 其实也会自己遍历集合 依次到底每一个元素
        // 把到底每一个元素 传递给下面的accpet方法
        // s表示集合中的每一个元素
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        });

        // Lambda表达式
        coll.forEach(s -> System.out.println(s));
    }

}
