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
