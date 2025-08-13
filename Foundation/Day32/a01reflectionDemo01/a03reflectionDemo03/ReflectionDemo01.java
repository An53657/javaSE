/*
方法名                                                            说明                            
Field[] getFields()   )                                        返回所有成员变量对象的数组（只能拿public的） 
Field[] getDeclaredFields()                                      返回所有成员变量对象的数组，存在就能拿到  
Field getField(String name))                                     返回单个成员变量对象（只能拿public的）   
Field getDeclaredField(String name)                             返回单个成员变量对象，存在就能拿到     
 */
package Day32.a01reflectionDemo01.a03reflectionDemo03;

// import java.lang.reflect.Constructor;

// import java.lang.reflect.Constructor;

public class ReflectionDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
    //  //1.获得整体（class字节码文件对象）
    //     Class clazz = Class.forName("com.itheima.reflectdemo.Student");


    //     //2.获取构造方法对象
    //     //获取所有构造方法（public）
    //     Constructor[] constructors1 = clazz.getConstructors();
    //     for (Constructor constructor : constructors1) {
    //         System.out.println(constructor);
    //     }

    //     System.out.println("=======================");

    //     //获取所有构造（带私有的）
    //     Constructor[] constructors2 = clazz.getDeclaredConstructors();

    //     for (Constructor constructor : constructors2) {
    //         System.out.println(constructor);
    //     }
    //     System.out.println("=======================");

    //     //获取指定的空参构造
    //     Constructor con1 = clazz.getConstructor();
    //     System.out.println(con1);

    //     Constructor con2 = clazz.getConstructor(String.class,int.class);
    //     System.out.println(con2);

    //     System.out.println("=======================");
    //     //获取指定的构造(所有构造都可以获取到，包括public包括private)
    //     Constructor con3 = clazz.getDeclaredConstructor();
    //     System.out.println(con3);
    //     //了解 System.out.println(con3 == con1);
    //     //每一次获取构造方法对象的时候，都会新new一个。

    //     Constructor con4 = clazz.getDeclaredConstructor(String.class);
    //     System.out.println(con4);

    }
}
