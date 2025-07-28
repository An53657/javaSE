package Day25.a01Immutablesetdemo01;

import java.util.Map;
import java.util.Set;

public class ImmutablesetDemo03 {
    public static void main(String[] args) {
        // 创建不可变的Map集合
        //小细节1：肩不能重复
        //小细节2：Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
        //小细节3：如果要传递多个键值对对象，数量大于10个在Map集合有个方法ofEnty方法
        Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8);

        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            int number = map.get(key);
            System.out.print(number + " ");
        }
    }
}