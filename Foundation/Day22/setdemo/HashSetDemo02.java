package Day22.setdemo;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        Stundent s1 = new Stundent("zhangsan", 23);
        Stundent s2 = new Stundent("lisi", 26);
        Stundent s3 = new Stundent("zhangsan", 23);
        Stundent s4 = new Stundent("wangwu", 22);

        HashSet<Stundent> hs = new HashSet<>();

        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        hs.add(s4);
         System.out.println(s4);
         
        }
    }
 
