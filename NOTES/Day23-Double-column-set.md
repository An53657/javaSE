# 双列集合 Double-column-set

---

## 双列集合的特点
1. 双列集合的特点
   - 双列集合一次需要存一对数据，分别为键和值
   - 键不能重复，值可以重复
   - 键和值一一对应，每一个键只能找到自己对应的值
   - 键+值这个整体我们称之为 键值对 或者 键值对对象，在java中叫做 Entry对象

2. Map常见API
   
         方法名                               说明
         v put (K key, V valie)              添加元素
         V remove(Object Key)                根据键删除键值对元素
         void Clear()                        移除所有的键值对元素
         boolean containsKey(Object Key)     判断集合是否包括指定的键
         boolean containsValue(Object Value) 判断是否包括指定的值
         boolean isEmpty()                   判断集合是否为空
         int size()                          集合的长度，也就是集合中键值队的个数
3. Map集合遍历方式
   - 键找值
   - 键值对
   - lambda表达式

---


## HashMap
4. HashMap底层是哈希表结构
5. 依赖hashCode方法和equals方法保证方法键的维以一
6. 如果键存储的是自定义对象，需要重写hashCode和euals方法
   如果值存储的是自定义对象，不需要重写hashCode和euals方法
7. HashMap特点
   - HashMap是Map里的一个实现类
   - 没有额外需要学习的特殊方法，直接使用Map里面的方法就可以了
   - 特点都是由键决定的：无序、不重、无索引
   - 注意:跟值没有关系


---


## 3. LinkedHashMap


---


## 4. TreeMap



---


## 5. 源码分析


---

## 6.可辨参数


---


## 7. Collections


---


## 8. 综合练习(集合的其它,斗地主)