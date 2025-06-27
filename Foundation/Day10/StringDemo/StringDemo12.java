//敏感词替换 简单的敏感词替换
package Day10.StringDemo;

public class StringDemo12 {
    public static void main(String[] args) {
        // 定义一个变量
        String take = "你玩的真好， 下次不要在玩了 ,op";
        // 敏感词替换 ***
        String result = take.replace("op", "***");
        System.out.println(result);

    }
}
