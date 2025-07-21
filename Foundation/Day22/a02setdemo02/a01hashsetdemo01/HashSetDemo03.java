package Day22.a02setdemo02.a01hashsetdemo01;

import java.util.Iterator;
import java.util.Set;

public class HashSetDemo03 {
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
