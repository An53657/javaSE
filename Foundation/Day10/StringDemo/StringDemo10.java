//需求 手机号屏蔽
package Day10.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        // 1.获取手机号码
        String phonenumber = "15585586925";
        // ----------------------------------------------------------------------
        // 2.获取手机号
        // 包头不包尾 包左不包右
        // 注意方法在截取的时候 只有返回值才是截取的结果 对原来的调用者的字符串不会发生任何影响的
        String start = phonenumber.substring(0, 3);
        System.out.println(start);
        // ----------------------------------------------------------------------
        // 3.截取末尾
        String end = phonenumber.substring(7);
        System.out.println(end);
        // ----------------------------------------------------------------------
        //4.字符串拼接比打印
        System.out.println(start + "****" + end) ;
    }

}
