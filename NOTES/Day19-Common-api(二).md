+# 常用api(二) Common-api(二)



## 1. 时间相关的知识
1. 时间标准时间
   格林尼治时间/格林威治时间(Greenwich Mean Time) 简称GMT 现在已弃用
   目前世界标时间(UTC)已替换为:原子钟
2. 中国标准时间：世界标准时间加8小时

---

## JDK7以前的时间类

### 1.Date
3. 如何创建日期对象

            空参构造

            Date date = new Date();

            带参构造

 
           Date date = new Date(zhidig)
2. 如何修改瞬间的毫秒值

           setTime(毫秒值)

3. 如何获取时间对象的毫秒值

            getTime();

---

### 2.SimpleDateFormat
4. 构造方法

            构造方法                                                    说明
            public SimpleDateFormat()                                  构造一个SimpleDateFormat，使用默认格式
            public SimpleDateFormat(String pattern)                    构造一个SimpleDateFormat，使用指定 格式
            方法名                                                      说明
             public final String format(Date ,date)                     格式化(日期 字符串)
             public Date prse(String sourse)                            解析(字符串 日期)

5. SimpleDateFormat两个作用
   格式化和解析
6. 如何指定格式
   yyyy年mm月dd日 HH:mm:dd:ss

---

7. Calendar表示什么
   表示一个时间的日历对象
   Calwnder代表了系统当前时间的日历对象，可以单独修改、获取时间中的年月日
   细节
   Calender是一个抽象类，不能直接创建对象

8. 如何获取对象
   通过getInstance方法获取对象

            方法名                                 说明
            public static Calender getInstance()   获取当前时间日历对象

9. 常见方法

            方法名                                 说明
            public final Date getTime()            获取日历对象
            public final setTime(Date date)        给日历设置对象
            public long getTimeInMillis()          拿到时间毫秒值
            public void setTimeInMillis(long millis) 给日历设置毫秒值
            public int get(int field)                取日历中的某个字段名
            public void set(int field,int value)     修改日历的某个字段名信息
            public void add(int field,int amount)    为某个字段名曾加或减少指定信息
    
10. 细节
    日历类中的月份范围0~11
    日历类中的星期的特点星期日是一周的第一天

---

## 2.jdk8的时间类

### 1.时间类(Date)

            1. Zomeld:时区
            方法名                     说明
            static set<String> getAvailableZoneIds()  获取java中支持的所有时区
            static ZoneId systemDefault()              获取系统默认时区
            static ZoneId of (String zoneId)           获取一个指定的时区

            2. Instrant:时间戳
            方法名                     说明
            static Instant now()       获取当前时间的Instant对象(标准时间)
            static Instant ofXXX(long epochMilli)  根据(秒 毫秒 纳秒)获取Imstant对象
            ZoneDateTime atZone(ZoneId zone)        指定时区
            boolean isXXX(Instant otherInstant)     判断系列的方法
            Instart miusXxx(long millisToSubtract)  减少时间系列的方法
            Instart PlusXxx(long millisToSubtract)  曾加时间系列的方法

            3. ZoneDateTime: 带时区的时间
            方法名                                    说明
            static ZonedDateTime now()                获取当前时间的ZonedDateTime对象
            static ZoneDateTime offxxx()               获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间)                 修改时间系列的方法
            ZonedDateTime minusXxx(时间)                减少时间系列的方法
            ZonedDateTime plusXxx(时间)                 增加时间系列的方法


---

### 2.日期格式化类(SimpleDateFormat)

          1. DateTimeFormatter 用于时间的格式化和解析

          方法名                                          说明
          static DateTimeFormatter ofPttern(格式)         获取格式对象
          String format(时间对象)                         按照指定格式格式化

---

### 3.日历类(Calemder)

         1. LocalDate 年月日
         2. LocalTime 时分秒纳秒
         3. LocalDateTime 年月日 时分秒纳秒 

         方法名                                          说明
         static xxx now()                               获取当前时间的ZonedDateTime对象
         static xxx offxxx()                            获取指定时间对象
         get开头的方法                                   获取年月日 时分秒纳秒
         isxxBefore() isafter                           比较两个local对象
          withX开头的                修改时间系列的方法
          minus开头的                减少时间系列的方法
          plusX开头的                增加时间系列的方法

---

### 4.工具类

         1. Duration:用于计算两个 "时间" 间隔 (秒，纳秒)
         2. Period  :用于计算两个 "日期" 间隔 (年月日)
         3. ChronoUnit:用于计算两个 "日期" 间隔 (所用的)
   


---


## 3.包装类
11. 什么是包装类？
    基本数据类型所对应的对象

12.  有那些包装类

    byte       --> Byte
    short      --> Short
    char       --> Character
    int        --> Integer
    long       --> Long
    float      --> Float
    double     --->Double
    boolean    --> Boolean
    
13. JDK5以后对包装类新增了什么特性？
      自动装箱：把基本类型会自动变成其对应的包装类
      自动拆箱：把包装类型会自动变成其对应的基本类型
14. 以后如何获取包装类的？
    不需要new, 不需要调用对象，直接赋值

           Integer i = 0;

           方法名                   说明
           public static String toBinaryString(int i )      得的二进制
           public static String toOctalString(int i)             得到八进制
           public static String toHexString(int i)               得到十六进制
           public static int parseIn(String s)                   将字符串类型的整数转成int类型的整数



---


## 4.综合练习


