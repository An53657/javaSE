package Day25.a01Immutablesetdemo01;

import java.util.Map;
import java.util.Set;

public class ImmutablesetDemo03 {
    public static void main(String[] args) {
        // 创建不可变的Map集合
        Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8);

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            int number = map.get(key);
            System.out.println(number);
        }
    }
}