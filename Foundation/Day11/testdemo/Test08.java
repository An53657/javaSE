//需求 定义JavaBean类 phone
//phone 属性 品牌 价格
//main方法中定义一个集合 存入三个对象
//分别为 小米 1000 苹果8000 锤子 2999
//定义一个方法将价格低于3000的数据信息返回 
package Day11.testdemo;

import java.util.ArrayList;

public class Test08 {
    public static void main(String[] args) {
        // 1. 创建集合
        ArrayList<Phone> list = new ArrayList<>();
        // 2. 创建三个对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        // 3. 添加元素
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // 4. 调用该方法
        // 返回一个集合， 拿一个集合接受
        ArrayList<Phone> phoneInfoList = getPhoneInfo(list);

        // 5. 遍历集合
        for (int i = 0; i < phoneInfoList.size(); i++) {
            Phone phone = phoneInfoList.get(i);
            System.out.println(phone.getBrand() + ", " + phone.getprice());
        }

    }
    // 技巧
    // 如果要返回多个数据 可以把这是数据放到一个容器里，在把容器返回
    // 这个容器可以是集合也可以是数组

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        // 创建一个集合，用于存储价格小于3000的手机
        ArrayList<Phone> resultArrayList = new ArrayList<>();
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            // 获取集合元素
            Phone p = list.get(i);
            // 获取集合里面的数据价格拿出来
            int price = p.getprice();
            // 判断价格如果价格小于3000
            if (price < 3000) {
                // 如果小于3000，直接把当前的手机对象(p)添加的
                // resultArrayList 集合当中
                resultArrayList.add(p);
            }
        }
        // 当循环结束之后，所有的信息都已经添加的集合当中了，
        // 返回 resultArrayList
        return resultArrayList;
    }
}
