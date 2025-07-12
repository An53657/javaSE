//请编写正则表达式用于校验用户输入的手机号是否满足要求
package Day18.a06regexfemo06;

public class RegexDemo01 {
    // String regex1 = "15598844525";
    public static void main(String[] args) {
        String regex2 = "1[3-9]\\d{9}";
        // 第一部分 只能是 1 开头
        // 第二部分 [3-9] 表示第二位只能是3-9之间
        // 第三部分 \\表示任意数字可出现9次，也不能出现9次
        System.out.println("15598844525".matches(regex2));

        System.out.println("-------------------------------");
         
    }

}
