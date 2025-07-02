# API &  字符串 String

## 一.API

  1. 什么是api？
  API(Application Programming Interface)：引用程序编辑接口
  简单理解就是：API就是别人已经写好的东西，我们不需要自己编写，直接使用即可。
  java API指的是JDK中提供的各种各样功能的java类，这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只要学习这些类如何使用即可。
  2. 什么是API帮助文档？
  帮助开发人员更好的使用API和查询API的工具。

---

## 一.String概述

1. String是java定义好的一个类，定义在java.lang包里的，所以使用时不需要导包。
2. java程序所有字符串文字（如"123"）都被实为此类的对象。
3. 字符串不可改变，他们的值在创建后不不能被改改。

---

## 1.创建String对象的两中方式

1. 直接赋值的方法

       eg: String si = "abc";
2. new空参构造的方法

       构造方法               构造说明
       public String ()      创建空白字符串，不含任何内容
       public String(String original) 根据传输的字符串，创建字符串对象
       public String(char [] chs) 根据字符数组， 创建字符串对象
       public String(byte [] chs) 根据字节数组，创建字符串对象

---

## 2.字符串的比较

1. ==比的是什么？
基本数据类型：比的是具体的值
引用数据类型·：比的是地址值
2. 两个方法

 boolean equals方法(要比较都是字符串) 完全一样才是true，否则false
 boolean equalsslgnoreCase(要比较的字符串) 忽略大小写

---

## 3.遍历字符串

    public char charAt(int index)，根据索引返回字符
    public int length 返回·字符串的长度
  
    数组长度 数组名.length
    字符长度 字符串对象.lenght()

---

## 4.截取字符串

    punlic substring(int beginlndex, int endlndex)截取
    注意点包头不包尾 包在不包右
    只有返回值才是截取的小段
    String substring(int begindex)截取到末尾

---

## 5.替换字符串

    string reqlace(旧值，新值) 替换
    注意
      只有返回值才是替换的结果
---

## 二. StringBuider

1. 什么是StringBuilder
  StrigBuilder可以看做一个容器，创建之后内容是可变的
  作用：可以提供字符串的操作效率

       StringBuilder构造方法
       方法名                     说明
       public StringBulider()     创建一个空白可变字符串对象 不含有任何内容
       StringBuilder(String str)  根据字符串的内容 来创建可变字符串对象
      
       StringBuilder常用方法
       方法名                                   说明
       public StringBuilder append (任意类型)   添加对象 并返回对象本身
       public StringBuilder reverser() 翻转容器中的内容
       public int length()             返回长度(支付出现的个数)
       public String toString()  通过toString()就可以实现把StringBuilder转换String

链式编程 当我们调用一个方法的时候 不需要用变量接受他们的结果 可以继续调用其他的方法

---

## 三. StringJoiner

1. StringJoiner跟StringBuilder一样 也可以看做一个容器 创建之后里面的内容是可变的

作用提高做字符串操作效率，且编写简洁

    构造方法
    方法名   说明
    public StringJoinr(间隔符)  创建一个StringJoiner对象 指定拼接时的间隔符号
    public StringJoiner(间隔符号，开始符号，结束符号) 创建一个StringJoiner对象 指定间隔符号，开始符号，结束符号

    成员方法
    方法名      说明
    public StringJoiner add(添加内容) 添加数据 并返回对象本身
    public int length() 返回长度(字符出现的个数)
    public String toString() 返回一个字符串 (该字符串就是拼接之后的结果)
总结

1. String
表示字符串的类 定义了很多字符串的方法Q
2. StringBuilder
一个会可变的字符串操作容器
可以高效的拼接字符串 还可以将字符串容器里面的内容反转
3. StringJoiner
JDK8出现的可变操作字符串的容器 可以高效 方面拼接字符串

---

## 四. 字符串原理

1. 扩展底层原理 字符串存储内存原理
  直接赋值会复用字符串常量池中的
  new出来的不会复用，而是开辟了一个小空间
2. 扩展底层原理 ==号比的到底是什么
  基本数据类型 比的是数据值
  引用数据类型 比的是地址值
3. 扩展底层原理   字符串拼接底层原理
   如果没有变量参与 都是字符串直接相加 编译之后就是拼接之后的结果 会复用串池中的字符串
如果有变量参与 会创建新的字符串 浪费内存
4. 扩展底层原理 StringBuilder提高效率原理图
   所有拼接的内容都会往StringBuilder里放不会创建很多无用空间 节约内存
5. 扩展底层原理 StringBuilder源码分析
  默认创建一个长度为16的字节数组
  添加的内容长度小于16 直接存
  添加的内容大于16扩容(原来容量*2+2)
  如果扩容之后还不够 以实际长度为准

  ---
