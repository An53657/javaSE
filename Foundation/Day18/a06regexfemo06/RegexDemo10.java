//口吃替换
//将字符串 我要学学编编程程
//替换为
package Day18.a06regexfemo06;

public class RegexDemo10 {
    public static void main(String[] args) {
        String str = "我要学学编编程程";
        // (.) 表示把重复的内容的第一个字符看做一组
        // \\1 表示第一个字符在次出现
        // + 至少一次
        // &1 表示把正则表达式第一组的内容，再次拿出来用
        str.replaceAll("(.)\\11+", "&1");

    }
}
