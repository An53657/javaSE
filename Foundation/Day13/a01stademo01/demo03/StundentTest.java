//定义学生工具类
//需求定义一个集合，用于存储学生对象
//学生类的属性为：name age gender
//定义一个工具类，用于获取集合中最大学生年龄
package Day13.a01stademo01.demo03;
//导入集合
import java.util.ArrayList;

public class StundentTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Stundent> list = new ArrayList<>();

        //创建带全参的三个学生对象
        Stundent s1  = new Stundent("zhansan", 23, "男");
        Stundent s2 = new Stundent("lisi", 24, "女");
        Stundent s3 = new Stundent("wangwu", 26, "女生");
        //添加对象  
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);

        //调用Stundent工具类
       int max = StundentUtil.getmaxAgeStundnet(list);
       System.out.println(max);
      
    
    
    
    
    }
}
