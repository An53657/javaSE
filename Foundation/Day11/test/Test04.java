//需求 定义一个集合 添加一些学生对象 并进行遍历
//学生类属性为 姓名 年龄 
package Day11.test;
//导入ArrayList集合类

import java.util.ArrayList;

public class Test04 {
    public static void main(String[] args) {
        ArrayList<Stundent> st1 = new ArrayList<>();
        // 创建学生对象
        Stundent s1 = new Stundent("wangwu,", 28);
        Stundent s2 = new Stundent("lisi,", 24);

        // 添加元素到紧集合
        st1.add(s1);
        st1.add(s2);

        // 遍历集合
        for (int i = 0; i < st1.size(); i++) {
            Stundent stu = st1.get(i);
            System.out.println(stu.getName() + ",  " + stu.getAge());
        }

    }
}
