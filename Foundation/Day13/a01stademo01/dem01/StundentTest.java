package Day13.a01stademo01.dem01;

public class StundentTest {
    public static void main(String[] args) {
        // 创建第一个Stundent对象
        Stundent s1 = new Stundent();
        Stundent.techername= "XXXX";

        // 对象·赋值
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        // 打印信息
       
        s1.show();
        System.out.println("--------------------");
      

        // 创建第二个Stundent对象
        Stundent s2 = new Stundent();
        // 赋值
        s2.setName("李四");
        s2.setAge(25);
        s2.setGender("男");
        System.out.println("--------------------");
        // 打印信息
        s2.study();
        s2.show();
    }
}
