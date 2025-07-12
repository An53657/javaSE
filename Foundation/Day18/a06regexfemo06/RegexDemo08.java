/*

        正则表达式在字符串方法中的使用

        方法名                                                               说明
        public String [] (String regex)                                      判断字符串是否满足正则表达式的规则
        public String relaceAll(String regex,String newStr)                  按照正则表达式规则进行替换
        public String [] (String regex)                                      按照正则表达式的规则进行切割
 */
package Day18.a06regexfemo06;

public class RegexDemo08 {
    public static void main(String[] args) {
        String str = "Hello 123456789 Hello";
        // 1. public String relaceAll(String regex,String newStr) 按照正则表达式规则进行替换
        // 细节：
        // 方法在底层跟之前一样，，也会创建文本解析器对象
        // 然后从头开始读取字符串的内容，只要有满足，那么就会用第二个参数去替换
        String result = str.replaceAll("\\d{1}", "lk");
        System.out.println(result);

        // 2.public String [] (String regex) 按照正则表达式的规则进行切割

        String[] arr = str.split("\\d{1}");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
