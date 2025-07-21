package Day22.a02setdemo02.a01hashsetdemo01;

import java.util.HashSet;

import Day22.a02setdemo02.a04otherdemo04.Stundent;

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
 
