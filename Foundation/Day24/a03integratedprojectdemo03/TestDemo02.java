/*自动点名器
 * 班级里有n个学生，实现随机点名器
 * 学生属性有姓名，年龄，性别，
 * 要求 70%是男生
 *      30%是女生
    
  
 */
package Day24.a03integratedprojectdemo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo02 {
    public static void main(String[] args) {
        // 解决概率问题
        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();

        // 添加概率数字
        Collections.addAll(list, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(list, 0, 0, 0);

        // 打乱数据
        Collections.shuffle(list);

        // 创建Random对象
        Random r = new Random();
        int indes = r.nextInt(list.size());
        int number = list.get(indes);
        System.out.println(number);

        // 创建集并添加姓名
        ArrayList<String> boyist = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyist, "1", "2", "3", "4", "5", "6", "7");
        Collections.addAll(girlList, "8", "9", "10");

        if (number == 1) {
            int boyIndex = r.nextInt(boyist.size());
            String boyName = boyist.get(boyIndex);
            System.out.println(boyName);
        } else {
            int girlIdex = r.nextInt(girlList.size());
            String girlName = girlList.get(girlIdex);
            System.out.println(girlName);
        }
    }
}
