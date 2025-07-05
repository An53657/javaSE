/*带有继承结构的标准JavaBean类
父类：(Employee)
1.经理(Manager)
成员变量：工号、姓名、工资、管理奖金
成员方法：工作(管理他人)、吃饭(吃米饭)

厨师：Cook
成员变量：工号、姓名、工资
成员方法：工作(炒菜)、吃饭(吃米饭)
*/
package Day13.a03extendsdemo03;

public class Test {
    public static void main(String[] args) {
        // 创建经理对象并用带全参数赋值
        Manager m = new Manager("001", "zhangsan", 8000, 6000);
        // 获取并打印
        System.out.println("经理: ");
        System.out.println("id为: " + m.getId() + ", " + "姓名为： "
                + m.getName() + ", " + "工资为： " + m.getSalary() + "奖金为： " + m.getbonus());
        m.eat();
        m.work();

        System.out.println("---------------------------------");

        //创建厨师对象并用带全参数赋值
        Cook c  = new Cook("001","lisi",500);

        // 获取并打印
        System.out.println("厨师: ");
        System.out.println("id为: " + c.getId() + ", " + "姓名为： "
                + c.getName() + ", " + "工资为： " + c.getSalary());
        //调用方法
        c.eat();
        c.work();
    }

}
