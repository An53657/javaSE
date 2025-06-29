package Day10.stringbuilderdemo;


public class StringBuilderDemo03 {
    public static void main(String[] args) {
        // 用链式编程的思想
        // 创建StringD=Builder
        StringBuilder sb = new StringBuilder();
        // 添加元素
        sb.append("1").append("2").append('1');
        System.out.println(sb);

    }
}