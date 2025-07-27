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


---


## 3.方法引用