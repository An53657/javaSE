// 需求 在main方法中定义一个集合 存入三个用户对象
// 用户属性为 id username password
// 要求 定义一个方法根据id查找用户的相关信息
// 如果存在 返回true
// 如果不存在 返回false
package Day11.testdemo;

import java.util.ArrayList;

public class Test06 {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<User> list = new ArrayList<>();
        // 创建三个User对象
        User u1 = new User("0110", "wangwu", "123456");
        User u2 = new User("0112", "lisi", "123456789");
        User u3 = new User("0113", "Kelly", "123456qwer");
        // 添加元素到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);
        // 调用该方法查看id是否存在
        boolean flage = contains(list, "0110");

        // 打印
        System.out.println(flage);

    }

    public static boolean contains(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            // 获取用户对象
            User u = list.get(i);
            // u调用id表示当前集合里的id
            String uid = u.getId();
            // 拿着集合力度的id和查找的id标比较，如果两者一样，返回true
            // 否则false
            if (uid.equals(id)) {
                // 如果找到了返回true
                return true;
            }

        }
        // 当循环结束表示，里面的所有的元素都比较完了，还没有一样的，就返回false
        return false;
    }
}
