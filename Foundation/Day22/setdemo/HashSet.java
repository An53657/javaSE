package Day22.setdemo;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> s1 = new java.util.HashSet<>();

        s1.add("Hello");
        s1.add("123");

        Iterator<String> it = s1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
