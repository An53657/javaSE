/*
32. 对象的哈希值的特点
    - 如果没有重写hashCode方法，不同计算的哈希值是不同的
    - 如果已经重写了hashCode方法，不同对象只要属性值相同，计算出来的哈希值就是一样的
    - 在小部分情况下，不同属性值或是地址值计算出来的哈希值也有可能是一样(这种情况叫哈希碰撞)
 */
package Day22.a02setdemo02.a01hashsetdemo01;

import Day22.a02setdemo02.a04otherdemo04.Stundent;

public class HashSetDemo01 {
    public static void main(String[] args) {
        Stundent s1 = new Stundent("zhangsan", 23);
        Stundent s2 = new Stundent("lisi", 25);

        // 计算哈希值
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 如果没有重写hashCode方法，不同计算的哈希值是不同的

        // 如果已经重写了hashCode方法，不同对象只要属性值相同，计算出来的哈希值就是一样的

        // 在小部分情况下，不同属性值或是地址值计算出来的哈希值也有可能是一样(这种情况叫哈希碰撞)

        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
