# Day35 XML

## 1.XML概述
1.  什么是配置文件
    用来保存程序运行时需要的一些参数

2. 常见的配置文件有哪些
    - txt
    - properties
    - xml

3. 三种配置文件的优缺点

    |            |  优点    | 缺点 |
    | ---------- | ---- | ---- |
    | txt        | 没有优点 | 不利于阅读 |
    | properties | 键值对形式易于阅读，解析简单 | 无法配置一组一组的数据 |
    | xml        | 可以配置成组出现的数据，易于阅读 | 解析比较复杂 |

4. 配置文件怎么选择
   - 数据量比较少，一个键对应一个值，使用properties
   - 数据量比较多，使用xml

5. XML是什么
   - XML全称为(EXwnsible Makup Language)，是一种可扩展的标记语言
   - 它是一种数据的表示格式，可以用于自定义数据格式

6. XML的作用
   - 存储数据和传输数据
   - 作为软件的配置文件

7. XML语法规则
   - 文档的后缀名为：.XML
   - 文档必须是第一行
   ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    version:   XML默认版本号码，该属性是必须存在的
    encoding： 本XML编码
   ```

8. XML标签(元素)规则
   - 标签有一对尖括号和合法标识符组成：<name></name> 必须存在根标签，有且只能有一共
   - 标签必须成对出现，有开始，有结束：<name></name>
   - 特殊标签可以不成对，但必须有结束标记 如：<br/>
   - 标签中可以定义属性，属性和标签名空格隔开，属性值必须用引号引起来<stundent id = ""1.0></stundnet>
   - 标签需要正确嵌套

9. XML其他组成
   - xml文件可以定义注释：<!- 注释内 -->
   - xml文件特殊字符
     ```xml
     &lt;   < 小于
     &gt;   > 大于
     &amp;  & 和号
     &apos; ' 单引号
     &quot；" 双引号
     ```


10. XML文件可以存在CDATA区：<![CDATA[内容]]>

11. XML组成格式要求是什么
    - 文档后缀必须是xml
    
    - 文档声明必须是第一行
    
    - 必须存在一个根标签，有且只能有一个
    
    - XML文件中可以定义注释信息：<!- 注释内容 -->
    
    - 标签必须成对出现，有开始，有结束标签：<name></name>
    
    - 必须正确嵌套

12. XML文档约束一DTD
    - ![DTD使用](../imgs/Day35/01-XML文档约束-DTD使用.png)

13. 文档约束-schema
    - schema可以约束具体数据类型，约束能力更强大
    - schema半身也是一共个xml文件，本身也受到其他约束文件的要求，所以编写更加严谨

## 2.XML解析技术
14. XML数据的作用，最终需要怎么处理
    - 存储数据，做配置信息，进行数据传输
    - 最终需要被程序进行读取，解析里面的信息

15. 什么是XML解析
    - 使用程序读取XML中的数据

16. 两种解析方式
    - SAX解析
    - DOM解析(重点)

17. SAX和DOM优缺点
    
    SAX:不会把整体的XML文件加载到内存，而是从上到下逐行扫描
    缺点：只能读取，不能添加，不能删除
    优点：因为它是逐行扫描不需要把整体的XML文件都加载到内存，所以它可以解析比较大的XML文件
    
    DOM:会把整体XML文件都加载到内存，会把整个整体在内存中形成一个树形结构，我们 可以通过这个树形结构去解析XML文件
    优点：可以读取，添加，删除等
    缺点：需要XML文件全部加载到内存，所以不能解析非常大的文件
    
    | 名称  | 说明                                                         |
    | ----- | ------------------------------------------------------------ |
    | JAXP  | SUN公司提供的一套XML的解析API                                |
    | JDOM  | JDOM是一个开源项目，它基于树形结构，利用纯JAVA技术对XML文档实现解析，生成，序列化以及多种操作 |
    | dom4j | 是JDM的升级版，用来读写XML文件的，性能优越，功能强大，易用的特点， |
    | jsoup | 功能强大的DOM方式的XML解析开发包，尤其对HTML解析更加分便     |
    
18. DOM 解析文档对象模型是怎样的
    - Document对象 ：    整个XML文档
    - Element对象  ：    标签
    - Attribute对象：    属性
    - Text         ：    文本内容

20. DOM解析常用的技术框架
    - DOM4j

21. dom的解析思想
    - ![dom的解析思想](02-dom的解析思想-1.png)

22. DOM4j解析XML-到的Doucument对象
    ```
    SAXReader类
    构造器/方法                         说明
    public SAXReader()                 创建DOM4J的解析对象
    Doucument read（(String url)        加载XML文件为Document对象
    ```

    ```
    Document类
    方法名          说明
    Element getRootElement()            获取根元素对象
    ```

​23.   解析XML
    ```
    方法名                                     说明
    List<Element> elements()                   得到当前元素下的所有子元素
    List<Element> elements(String name)        得到当前元素下指定名字的子元素反回集合
    Element element(String name)               得到当前元素下指定名字子元素，如果有相同的名字返回第一个
    String getname()                           得到元素名字
    String attributeValue(String name)         得过属性名直接到的属性值
    String element(子元素名)                   得到指定名称的子元素文本
    String  getText()                          得到文本
    ```