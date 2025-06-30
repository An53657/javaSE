// 需求 在main方法中定义一个集合 存入三个用户对象
// 用户属性为 id username password
// 要求 定义一个方法根据id查找用户的相关信息
// 如果存在 返回索引
// 如果不存在 返回-1
package Day11.test;

import java.util.ArrayList;

public class Test07 {
    public static void main(String[] args) {
     //创建集合
        ArrayList<User> list = new ArrayList<>();
        //创建三个User对象
        User u1 = new User("0110", "wangwu", "123456");
        User u2 = new User("0112", "lisi", "123456789");
        User u3 = new User("0113", "Kelly", "123456qwer");
        //添加元素到集合
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //调用该方法查看id是否存在
        int index = getIndex(list, "0110");
        System.out.println(index);
    }
    public static int getIndex(ArrayList<User> list , String id){
            for(int i = 0 ; i < list.size(); i++){
                //获取用户对象
                User u = list.get(i);
                // 调用id表示集合里元素
                String uid = u.getId();
                if(uid.equals(id)){
                    return i;
                }
            }
            return -1;
    }
}
