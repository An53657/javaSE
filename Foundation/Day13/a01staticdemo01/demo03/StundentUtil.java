//定义一个工具类，用于获取集合中最大学生年龄
package demo03;

import java.util.ArrayList;

public class StundentUtil {
    private StundentUtil(){}

    //
    public static int getmaxAgeStundnet(ArrayList<Stundent> list ){
        //定义一个参照物
        //默认为0索然的学生年龄是最大的
        int max = list.get(0).getAge();

        //循环遍历
        for(int i = 0; i < list.size();i++){
            //i是索引
            //list.get[i] 是元素或是学生对象 
            //还需要获取getAge才能比较
            if(list.get(i).getAge() > max ){
                 max = list.get(i).getAge();
            }
    }
    //直接返回max
    return max;
}
}
