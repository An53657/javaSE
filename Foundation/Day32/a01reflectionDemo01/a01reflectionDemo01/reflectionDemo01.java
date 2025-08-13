/*
2. 获取class对象三种方法
   - class.forName(全类名);
     最为常用

   - 类名.class
     一般作为参数进行传递

   - 对象.get.getClass();
     - 当有了这类的对象是，才可以使用
 */
package Day32.a01reflectionDemo01.a01reflectionDemo01;

public class reflectionDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // // 1 class.forName(全类名); 最为常用
        // Class classz1 = Class.forName("Day32.a01reflectionDemo01.Stundent");
        // System.out.println(classz1);

        // // 2.类名.class 一般作为参数进行传递
        // Class class2 = Stundent.class;
        // System.out.println(class2);

        // // 3.对象.get.getClass(); 当有了这类的对象是，才可以使用
        // Stundent s = new Stundent();
        // Class class3 = s.getClass();
        // System.out.println(class3);

        // System.out.println(classz1 == class2);
        // System.out.println(class2 == class3);
    }
}
