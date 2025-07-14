# 集合进阶(一) advanced-collection(一)

## 1.集合体系结构
1. 单列结合 Collection

                                                         Collaction
                            
                                              list                                     set
                                
                                ArrayList    LinkedList    Vector               HashSet     TreeSet
                                                                        
                                                                            LinkedHashSet
2. List和Set集合的特点
   - List集合：添加元素的特点是有序的，可重复的、索引的
   - Set集合： 添加元素的特点是无序的，不重复的，无索引的
   有序时是存和取的顺序是一样的

3. Collection是单列集合的祖宗接口，它的功能是全部单列集合的都可以继承使用的

        方法名                            说明
        public boolean add(E e)           把给定的对象添加到当前集合中
        public void clear()               清空集合中的所有元素
        public boolean remove(E e)        把给定的对象在当前的集合中删除
        public boolean contaisn(Object obj) 判断集合中是否包括给定对象
        public boolean isEmpty()            判断当前集合是否为空
        public int size                     返回集合中元素的个数/集合的长度


---


## 2.Collection集合
4. Colletion的遍历方法
   - 迭代器遍历：迭代器在Java的类是Iterator,迭代器是集合通用遍历方式

   - 迭代器在遍历集合的的时候是不依赖索引的 它是通过创建指针，并移动指针来获取索引的来获取元素的
   - 迭代器的三个方法
         Collection集合获取迭代器
         方法 名                               说明
         Iterator<E> iterator()                返回迭代器对象 默认指向当前集合的0索引

         Iterator中的常用方法
         方法名                                说明
         boolean hasNext()                     判断当前位置是否有元素 有元素返回true 没元素返回false
         E next ()                             获取当前位置元素，并将迭代器对象移向下一个位置
     - 迭代器的四个细节
       - 如果当前位置没有元素，还要强行获取，会报NoSuchElementException
       - 迭代器遍历完毕，指针不会复位
       - 循环中只能用一次next方法
       - 迭代器遍历时，不能用集合的方法进行增加或删除

   - 增强for遍历
     - 增强for的底层就是一个迭代器，为了简化迭代器的代码书写的
     - 它是jdk5之后出现的，其内部原理就是一个Iterator迭代器
     - 所有的单列集合和数组才能用增强for循环进行遍历

     增强for循环格式
     
                    for(元素的数据类型 :数组或者集合 ){

                     }
      - 增强for的细节
        修改增强for的变量，不会改变集合中原本的数据
    - Lambda表达式遍历
      - 得益于JDK 8开始的新技术Lambda表达式，提供了一种更简单，更直接遍历方式
 
              方法名                                                   说明
              default void forEach(Consumer< ? Super T > action );    结合Lambda遍历集合

5. 总结：
    - Colletion是单列集合的顶级接口 所有方法被List和Set系列结合所共享
6.  - 常见的成员方法
     add clea remove contains isEmpty size
7.  - 三种通用的遍历方式
      迭代器遍历： 在遍历的过程中需要删除元素，使用迭代器
      增强for遍 Lambda: 仅想遍历，那么使用增强for或Lambda表达式

---


## 3.list集合


---


## 4.ArrayList集合


---


## 5.linkedList集合