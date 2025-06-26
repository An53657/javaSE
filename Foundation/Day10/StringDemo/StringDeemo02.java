package Day10.StringDemo;

public class StringDeemo02 {
    public static void main(String[] args) {
        String str0 = new String("bluearchive");
        String str1 = "blueArchive";
      

        //==比较
        //基本数据类型：
        //引用数据类型：

        System.out.println(str1 == str0);

        //比较字符串传递的内容
        boolean  redsult0 = str1.equals(str0);
        System.out.println(redsult0);

        //比较字符串的内容 忽略大小·写
        boolean result1 = str0.equalsIgnoreCase(str1);
        System.out.println(result1);


    }
}
