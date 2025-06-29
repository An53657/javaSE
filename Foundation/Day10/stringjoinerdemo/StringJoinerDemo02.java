package Day10.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo02 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner( ",", "[", "]");
        sj.add("1").add("2").add("3");
        System.out.println(sj);
        int let =sj.length();
        System.out.println(let);
        String str = sj.toString();
        System.out.println(str);
    }
}
