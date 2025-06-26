package Day10.StringDemo;

public class StringDemo01 {
    public static void main(String[] args) {
        // 1. 使用直接赋值的方法获取字符串对象·
        String s1 = "Hello Woeld";
        System.out.println(s1);

        // 2.使用new方式获取字符串对象
        // 空参构造：可以获取空白的字符串对象
        String s2 = new String();
        System.out.println(s2);// ""没有任何内容的字符串

        // 传递一个字符串，根据传递字符串的内容在创建新的字符串对象
        String s3 = new String("Hello,World");
        System.out.println(s3);

        // 创建字符数组，根据字符数组里的的内容再创建新的字符串对象
        char[] chas = { 'a', 'b', 'c' };
        String s4 = new String(chas);
        System.out.println(s4);
    }
}
