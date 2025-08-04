# 常用api(一) Common-api(一)


---

## 1.Math
1. Math帮助我们进行数学计算的工具类

 

2. 里面的方法都是静态的
常见的方法如下：
      
       方法名                                                说明
       public static int        abs(int a)                  获取参数绝对值
       public static double     ceil(double a )             向上取整
       public static double     floor(double a)             向下取整
       public static int        round(float)a               四舍五入
       public static int        max  (int a , int b)        获取两个int值中的较  大值
       public static double     pow  (double a ,double b)   返回a的次幂的值
       public static double     random()                    返回double的随机  值，范围[0.0,1.0）


---

## 2.Sysrem
1. System:也是一个工具类，提供了一些与系统相关的方法
2. 时间原点：1970年1月1日0.0.0，我国在东巴区，有八个小时的时差
3. 1秒=1000毫米
4. 常见的方法

       方法名                                              说明
       public static void exit(int static)                 终止当前运行的java虚拟机
       public static long currentTimeMillis()              返回当前系统时间毫秒值形式
       public static void arraycopy(数据源数组，起始索引，目的地索引，起始索引，拷贝个数)    拷贝数组

---

## 3.Runtime
                  
       方法名                                              说明
       public     static Runtime getRuntime()              当前系统环境运行对象
       public void exit (int static)                       停止虚拟机
       public int  availableProcessoors()                  获取CPU线程数
       public log  maxMemory                               JVM能从系统中获取总内存大小(单位 byte字节)
       public log  totalMemory                               JVM能已经从系统中获取总内存大小(单位 byte字节)
       public log  freeMemory                               JVM剩余内存大小(单位 byte字节)
       public Process exec (string comand)                  运行cmd命令

---

## 4.Object
5. Object是java顶级父类所有类直接或间接继承于Object类
       
        方法名                                             说明
        publicc String toString()                          返回对象字符串表示形式
        public boolean equals(Object obj)                  比较两个对象是否相等
        protect Object clone(int a)                        对象克隆 


---

## 5.Objects是java的一个工具类
  
       方法名                                              说明
       public static boolean equals(Object a, Object b)    先做非空判断，比较两个对象
       public static boolean isNull(Object obj)            判断对象是否为Null,为null返回true,反之
       public static boolean nonNull(Object obj)            判断对象是否为Null,跟isnull结果相反

---

## 6.BigInteger构造方法
6. 如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取
7. 如果BigInteger表示的数字超出long的范围，可以用构造方法获取
8. 对象一旦创建，BigInteger内部记录的值不能发生变化
9. 只要进行了计算都会产生新的BigInteger对象


       方法名                                                说明
       public BigInteger (int num, Random rnd)               获取随机大整数，范围[ 0~  2 的 num 次方 - 1]
       public BigInteger(String val)                         获取指定的大整数
       public BigInteger(String val , int radix)             获取指定进制的大整数

       静态构造
       public static BigInteger valOf(log val)                静态方法获取BigInteger对象，内部有优化
        
       构造方法
       public BigInteger add(BigInteger val)                  加法
       public BigInteger subtract(BigInteger val)             减法
       public BigIntefer multiply(bigInteger val)             乘法
       public BigInteger divide(BigInteger val)               除法 获取商
       public BigInteger divideAndRemaindeer(BigInteger val)               除法 获取商和余数
       public boolean equals(Object x)                        比较是否相同
       public BigInteger  pow(int exponent)                    次幂
       public BigInteger  max/min(BigInteger val)              返回较大大值/返回较小值
       public intValue(BigInteger val)                          转为int类型的整数，超出范围的数据有误    

10. BigDecimal的作用是说明
    表示加大的小数和解决小数运算精度失真的问题
11. BigDecimal对象如何获取
    
        BigDecimal bd1 = new BigDecimal("较大的小数")
       BigDecimal bd2 = BigDecimal.valueOf(0.01);

12. 常见的操作

       构造方法
       public BigDecimal add(BigInteger val)                  加法
       public BigDecimal subtract(BigInteger val)             减法
       public BigDecimal multiply(bigInteger val)             乘法
       public BigDecimal divide(BigInteger val)               除法  
       public BigDecimal divide(BigInteger val,精确几位，舍入模式)               除法  


---

## 7. 正则表达式
13. 正则表达式的作用
   作用一：校验字符串是否满足规则
   作用二：在一段文本中查找满足要求的内容

14. 常用规则

       字符类(只匹配一个字符)

        [abc]          只能是a.b,或c
        [^abc]         除了a,b,c之外的任何字符
        [a-zA-Z]       a到z A到Z 包括  范围
        [a-d[m-p]]     a到d 或m到p
        [a-z&&[def]]   d,e或(交集)
        [a-z&&[^bc]]   a-z,除了b和c(等同于[ad-z])
        [a-z&&[^m-pq]] a到z，除了m-p(等同于[a-lq-z])


        预定义字符(只匹配一个字符)
       
        .                任何字符
        \d               一个数字：[0-9]
        \D               非数字：  [0-9]
        \s               一个空白字符：[\t\n\xOB\f\r]
        \S               非空白字符    [^\s]
        \w               [a-zA-Z_0-9]英文、数字、下划线
        \W               [^\W]一个非单词字符

        数量词

        X?               x,一次，或零次
        X*               X，零次，或多次
        X+               X，一次  或多次
        X{n}             X,正好n次
        X{N,}            X，至少n次
        X{n,m}           X，至少n次，但不超过m次

        正则表达式在字符串方法中的使用

        方法名                                                               说明
        public String [] (String regex)                                      判断字符串是否满足正则表达式的规则
        public String relaceAll(String regex,String newStr)                  按照正则表达式规则进行替换
        public String [] (String regex)                                      按照正则表达式的规则进行切割
       
15. 什么是分组？
    分组就是一个小括号

16. 正则表达式分组有两中
    捕获分组和非捕获分组

17.  捕获分组(默认)
     可以获取每组中的内容反复使用
18. 组号的特点
    从1开始，连续不间断
    以左括号为基准，最左边的是第一组
19. 非捕获分组
    分组之后不需要本组数据，仅仅把数据括起来
    (? :) (?=) (?!)都是非捕获分组

---