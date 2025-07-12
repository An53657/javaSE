package Day18.a06regexfemo06;

public class RegexDemo02 {
    public static void main(String[] args) {
        // 编写正则表达式用于验证用户密码是否填写正确
        // 要求：大小写，字母，下划线 一共4-16位
        String regex = "\\w{4-16}";
        System.out.println("");

        // 身份证简单校验
        // 前17位是数字 最后一位可以是数字、大小写或者是小写的下
        String regx = "[1-9]\\d{16}(\\d|\\w|x)";
        System.out.println(regx);
        System.out.println(regex);
    }
}
