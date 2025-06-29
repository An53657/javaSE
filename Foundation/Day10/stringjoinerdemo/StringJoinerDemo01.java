package Day10.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo01 {
    public static void main(String[] args) {
        //创建StringJoiner对象
        StringJoiner sj = new StringJoiner("---");
        sj.add("1").add("2").add("3");
        System.out.println(sj);
        sj.toString();
        System.out.println(sj);
    }
}
