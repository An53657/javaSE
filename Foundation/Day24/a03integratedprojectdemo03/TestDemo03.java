/*自动点名器3
班级里有n个学生
要求
被点到的学生不会在被点到
但是如果班级中的学生点完了，需要重新开始第二轮点名
 */
package Day24.a03integratedprojectdemo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo03 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<String> list = new ArrayList<>();

        // 创建临时集合
        ArrayList<String> tempList = new ArrayList<>();

        // 添加学生
        Collections.addAll(list, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        // 获取集合长度

        for (int i = 0; i < 10; i++) {
            System.out.println("=========== " + "第" + i + "轮 +==========================");

            int count = list.size();

            Random r = new Random();
            for (int j = 0; j < count; j++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                tempList.add(name);
                System.out.println(name);
            }
            list.addAll(tempList);
            tempList.clear();

        }

    }

}
