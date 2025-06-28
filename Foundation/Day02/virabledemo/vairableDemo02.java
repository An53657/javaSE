package Day02.virabledemo;
//基本数据类型的使用

//byte、short、int、long、float、double类型的使用

public class vairableDemo02 {
   public static void main(String[] args) {
      // byte类型：占用1个字节，范围是-128到127
      byte a1 = 20; // 1个字节，范围是-128到127
      System.out.println(a1); // 输出：200

      // short类型：占用2个字节，范围是-32768到32767
      short a2 = 200; // 2个字节，范围是-32768到32767
      System.out.println(a2); // 输出：200000000

      // int类型：占用4个字节，范围是-2147483648到2147483647
      int a3 = 2000000000; // 4个字节，范围是-2147483648到2147483647
      System.out.println(a3); // 输出：2000000000

      // long类型：占用8个字节，范围是-9223372036854775808到922337203685477580
      long a4 = 2000000000000000000L; // 8个字节，范围是-9223372036854775808到9223372036854775807
      // 注意：long类型的数值后面要加L或l，表示这是一个long类型的数值
      // 如果不加L或l，默认是int类型的数值，超出范围会报错
      // 例如：long a4 = 2000000000000000000; // 报错：integer number too large
      // 解决方法：在数值后面加L或l，表示这是一个long类型的数值
      // 例如：long a4 = 2000000000000000000L; // 正确
      // 注意：L和l是区分大小写的，建议使用大写的L，避免和数字1混淆
      // 例如：long a4 = 2000000000000000000l; // 正确，但不推荐使用小写的l
      System.out.println(a4); // 输出：2000000000000000000

      // float类型：占用4个字节，范围是-3.40282347E+38到3.40282347E+38
      float a5 = 3.14F; // 4个字节，范围是-3.40282347E+38到3.40282347E+38
      // 注意：float类型的数值后面要加F或f，表示这是一个float类型的数值
      // 如果不加F或f，默认是double类型的数值，超出范围会报错
      // 例如：float a5 = 3.14; // 报错：possible lossy conversion from double to float
      // 解决方法：在数值后面加F或f，表示这是一个float类型的数值
      // 例如：float a5 = 3.14F; // 正确
      // 注意：F和f是区分大小写的，建议使用大写的F，避免和数字0混淆
      // 例如：float a5 = 3.14f; // 正确，但不推荐使用小写的f
      System.out.println(a5); // 输出：3.14

      // double类型：占用8个字节，范围是-1.7976931348623157E+308到1.7976931348623157E+308
      double a6 = 3.14; // 8个字节，范围是-1.7976931348623157E+308到1.7976931348623157E+308
      // 注意：double类型的数值后面不需要加D或d，表示这是一个double类型的数值
      System.out.println(a6); // 输出：3.14

      // char类型：占用2个字节，范围是0到65535
      char a7 = '我'; // 2个字节，范围是0到65535
      System.out.println(a7); // 输出：我
      // 注意：char类型的字符要用单引号括起来，表示这是一个char类型的字符
      // 如果用双引号括起来，表 这是一个String类型的字符串，超出范围会报错
      // 例如：char a7 = "A"; // 报错：incompatible types: String cannot be converted to
      // char
      // 解决方法：用单引号括起来，表示这是一个char类型的字符
      // 例如：char a7 = 'A'; // 正确
      // 注意：char类型的字符可以用Unicode编码表示，范围是0到65535
      // 例如：char a7 = '\u0041'; // 正确，表示字符A的Unicode编码
      // 注意：char类型的字符可以用ASCII编码表示，范围是0到127
      // 例如：char a7 = 65; // 正确，表示字符A的ASCII编码

      // boolean类型：占用1个字节，范围是true或false
      boolean a8 = true; // 1个字节，范围是true或false
      boolean a9 = false; // 1个字节，范围是true或false
      // 注意：boolean类型的值只能是true或false，不能是其他值
      System.err.println("---------------------------------------------------------------------");

      System.out.println(a8); // 输出：true
      System.out.println(a9); // 输出：false
      // 注意：boolean类型的值只能是true或false，不能是其他值
      // 例如：boolean a8 = 1; // 报错：incompatible types: int cannot be converted to
      // boolean
      // 解决方法：用true或false表示boolean类型的值
      // 例如：boolean a8 = true; // 正确
      // 注意：boolean类型的值可以用逻辑运算符表示，范围是true或false
      // 例如：boolean a8 = (1 == 1); // 正确，表示1等于1的结果是true
      // 注意：boolean类型的值可以用条件运算符表示，范围是true或false

   }
}
