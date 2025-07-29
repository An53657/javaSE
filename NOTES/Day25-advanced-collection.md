##  Day25 集合进阶 advanced-collection

## 1.不可变集合
1. 不可变集合的特单
   不可变集合：不可以被修改的集合，一旦创建长度和内容不能改

2. 
            创建不可变集合的格式
            在List,Set,Map接口中，都存在静态的of方法，可以获取一个不可变的集合

            方法名                      说明
            static <E> list<E> of(E....elements)    创建一个具有指定元素的List集合对象
            static <E> Set<E> of(E....elements)    创建一个具有指定元素的Set集合对象
            static <E> Map<E> of(E....elements)    创建一个具有指定元素的Map集合对象
            注意：集合不能添加元素，删除元素和修改元素
3. 三种方式的细节
   - List 直接使用
   - Set  元素不能重复
   - Map  元素不能重复，键值对数量最多10个 超过10个用ofEntires方法
          如果JDK大于10，用opyArray方法

---

## 2. Stream流
4. Stream流的作用
   结合Lsmbda表达式，简化集合、数组的操作

5. Stream流的使用步骤
   - 先得到一条Stream流(流水线)，并把数据放上去
   - 利用Stream流中的API进行各种操作


6. 中间方法

7. 终结方法


8. 先得到一条Stream流(流水线)，并把数据放上去
   
         获取方式          方法名                               说明
         单列结合          default Stream<E> Stream()           Collection中默认方法
         双列结合          无                                   无法直接使用Stream流
         数组              public static<T> Stream(T[] array)   Array工具类中的静态方法
         一堆零散数据       public static<T> of(T...values)

---
9. Stream流的中间方式

         名称                    说明
         Stream<T> filter(Predicate<? super T> predicate)   过滤
         Stream<T> limit(long maxSize)                      获取前几个元素
         Stream<T> skip (long n)                            跳过前几个元素
         Stream<T> disinct()                                元素去重，(依赖hashCode,equals方法)
         static <T> Stream<T> concat(Stream a , Stream b)   合并a和b两个流为一个流
         Stream<R> map(Function<T,R> mapper)                转换类型
         注意1：中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
         注意2：修改Stream流中的数据，不会影响原来集合或者数组中的数据


10. Stream终结方法

         名称                                            说明
         void forEach(counsumer action)                  遍历
         long count()                                    统计
         toarray()                                       收集流中的数据，放到数组当中
         collect(collector , collector)                  收集流中的数据，放到集合当中


## 3.方法引用