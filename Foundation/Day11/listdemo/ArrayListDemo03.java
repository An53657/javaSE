package Day11.listdemo;

import java.util.ArrayList;

public class ArrayListDemo03{
    public static void main(String[] args) {
        //练习
        //创建集合容器
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        list.add("hello woeld");
        //遍历集合并 打印
        for(int i = 0; i < list.size();i++){
            //i是索引
            //list.get(i) 获取集合元素
            String str = list.get(i);
            System.out.println(str);
        }
        }
}
