/*自动点名器
 * 班级里有n个学生，实现随机点名器
 * 学生属性有姓名，年龄，性别，
 */
package Day24.a03integratedprojectdemo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TesstDemp01 {

    public static void main(String[] args) {
        // 创建集合
        ArrayList<Integer> list1 = new ArrayList<>();
        // 添加元素
        Collections.addAll(list1, 1, 2, 4, 5, 6, 8, 9, 4, 5, 6, 7);
        // 打乱元素
        Collections.shuffle(list1);
        // 获取0索引元素
        System.out.println(list1.get(0));

        ArrayList<Integer> list2 = new ArrayList<>();
        // 添加元素
        Collections.addAll(list2, 1, 2, 4, 5, 6, 8, 9, 4, 5, 6, 7);
        // 随机
        Random r = new Random();
        int index = r.nextInt(list2.size());
        int name = list2.get(index);
        System.out.println(name);
    }
}