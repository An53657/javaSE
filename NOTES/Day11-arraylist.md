# ArrayList 集合


---

## 一.为什么要用集合

1. 区别：
长度：
  数组长度固定
  集合长度可变
存储类型：
  数组能存基本数据类型和引用数据类型
  集合只能存引用数据类型，如果要存基本数据类型需要把他们变成相应的包装类

---

## 二.集合

1. 泛型：限定集合存储的数据类型
2. . 怎么创建集合

        JDK7以后的写法
        构造方法
        ArrayList<里面写泛型> list = new ArrayList<>();

        成员方法 增 删 改 查
        方法名     说明
        boolean add(E e)  添加元素，返回值表示是否添加成功
        boolean remove(E e) 删除指定元素，返回值表示是否删除成功
        E remove(int index) 删除指定索引元素，返回被删除元素
        E set(int index,E e) 修改指定索引下的元素，返回原来的元素
        E get(int index)  获取指定索引的元素
        int siz() 集合的长度，也就是集合中元素的个数
3. 注意：  
·此时创建的的是ArrayList集合对象，二ArrayList是java已经写好的类
·这个类在底层做了一些处理
·打印对象不是地址值，而是集合中存储数据内容
·在展示的时候会拿着[]把所有的数据进行包裹

---

## 三.综合练习

1.基本数据类型对应的包装类

    byte       --> Byte
    short      --> Short
    char       --> Character
    int        --> Integer
    long       --> Long
    float      --> Float
    double     --->Double
    boolean    --> Boolean

---


