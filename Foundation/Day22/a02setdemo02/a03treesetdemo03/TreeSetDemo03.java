package Day22.a02setdemo02.a03treesetdemo03;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(12);
        ts.add(22);
        ts.add(74);

        System.out.println(ts);

        for (Integer i : ts) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------");
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        System.out.println("-----------------------------------------");
        ts.forEach(s -> System.out.println(ts));

    }
}
