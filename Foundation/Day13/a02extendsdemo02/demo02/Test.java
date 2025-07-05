/* 利用方法重写设计继承结构
现在有三种动物；哈士奇、沙皮狗、中华田园犬
暂时不考虑属性，只要考虑行为
请按照继承的思想特点进行继承体系设计

三种动物分别有以下的行为：
- 哈士奇： 吃饭(吃狗粮)、喝水、看家、拆家
- 沙皮狗： 吃饭(吃狗粮、吃骨头)、喝水、看家
- 中华田园犬：吃饭(吃剩饭)、喝水、看家
 */
package Day13.a02extendsdemo02.demo02;

public class Test {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------");
        // 创建哈士奇对象
        HusKy h1 = new HusKy();
        System.out.println("哈士奇： ");
        h1.eat();
        h1.drink();
        h1.breakHome();

        System.out.println("-------------------------------------------------------");

        // 创建中华田园犬
        ChineseDog c1 = new ChineseDog();
        System.out.println("中华田园犬: ");
        c1.eat();
        c1.drink();

        System.out.println("-------------------------------------------------------");
        // 创建沙皮狗
        ShaPei s1 = new ShaPei();
        System.out.println("沙皮狗: ");
        s1.eat();
        s1.drink();

    }

}
