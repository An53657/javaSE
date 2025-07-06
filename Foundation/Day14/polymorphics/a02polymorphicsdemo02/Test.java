/* # 根据需求完成代码

## 1. 定义狗类
    属性：年龄 
        颜色
    行为：eat(String something ) something表示吃的东西
          lookHome看家,方法 无参数

## 2.定义猫类：
    
    属性：年龄 
          颜色
    行为：eat(String something ) something表示吃的东西
          catchMouse 方法 无参数
## 3. 定义Person/饲养员
    属性：姓名 
         年龄
    行为：keepet(Dog dog ,Strung something)方法
         功能：喂养宠物，something:表示喂养宠物

         KeePet(Cat cat , String something)方法
         功能：喂养宠物，something:表示喂养宠物
         生成空参和带全参的构造方法，set和getg方法
## 4. 定义测试类(完成一下打印效果)
    keepet(Dog dog ,Strung something)方法打印内容如下：
           年龄为30岁的老王养了两只黑颜色的2岁的狗
           2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃

    KeePet(Cat cat , String something)方法打印如下内容：
            年龄为25岁的老李养了一只灰颜色的3岁的猫
            岁的灰颜色的猫咪着眼睛侧着头吃鱼
    */

package Day14.polymorphics.a02polymorphicsdemo02;

public class Test {
    public static void main(String[] args) {
        //创建对象
            Person p = new Person("老王", 30);
            Dog d = new Dog(2, "黑色");
            p.keepet(d, "骨头");
    }
}
