package Day10.stringbuilderdemo;

public class StringBublidDemo01 {
    public static void main(String[] args) {
        // 创建对象
        StringBuilder sb = new StringBuilder("123");

        // 添加元素
        sb.append("hellp");// 添加字符串
        sb.append(2);// 添加这整数
        sb.append('1');// 添加支付·

        // 反转
        sb.reverse();

        //获取长度
        int Len  = sb.length();
        System.out.println(Len);

      

        // 打印
        // 注意
        // StringBuilder类是java已经写好的类，不是我们写的
        // java对StringBuilder做了一些特殊的处理
        // 打印的不是地址在而是属性值
        System.out.println(sb);
    }
}
