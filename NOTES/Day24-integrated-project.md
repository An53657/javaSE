# 综合项目 integrated-project


---


## 1. 源码分析

---

## 2.可辨参数

1. 可变参数本质上就是一个数组
2. 作用：在形参中接受多个数据
3. 格式：数据类型...参数名称

            int...a
4. 注意事项
   - 形参列表中可变参数只能有一个
   - 可变参数只能放在形参列表的后面


---


## 3. Collections
5. Collections
   - 是java.util.Collections:是集合的工具类
   - 作用:Collwxtions不是集合，而是集合的工具类

            collections常用方法

            方法名称                                                                说明
            public static <T> boolean addAll(Collections<T> c,    T ...elments)     批量添加元素
            public static void shuffle(List<?> List)                                打乱List集合元素的顺序
            public static <T> void short(List<T> List)                              排序
            public static <T> void short(List<T> List Comparator<T> c)              根据指定规则进行排序
            public static <T> int binarySerach (List <T> List,T key)                以二分查找法查找元素
            public static <T> void copy (List <T> dest, List <T> src)               拷贝集合中的元素
            public static <T> int fill (List <T> List,T obj)                        使用指定元素填充集合
            public static <T> void max/min(Collections<T> coll)                     根据默认的自然排序获取最大值/最小值
            public static <T> voud swap(List <?> List, int i, int j)                交换集合中指定位置的元素
---


## 4. 综合练习(集合的其它,斗地主)
   对应思想
   如果原始数据的规律非常复杂，我们可以先手动排序让每一个数据跟唯一的序号产生对应关系
   序号就是数字，规律非常简单，后续的所有操作，我们以序号为准
   当真正需要操作原始数据时，则通过序号找到原始数据即可

---