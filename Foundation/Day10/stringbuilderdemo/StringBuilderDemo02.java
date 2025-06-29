package Day10.stringbuilderdemo;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        // 创建空白对象
        StringBuilder sb = new StringBuilder();
        // 添加对象
        sb.append("1");
        sb.append("2");
        // 打印
        System.out.println(sb);
        // 把StringBuilder变成字符串
        String str = sb.toString();
        System.out.println(str);

    }
}
