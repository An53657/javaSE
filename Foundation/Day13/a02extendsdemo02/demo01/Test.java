/*继承体系的练习(自己设计一个继承体系)
现在有四种动物：布偶猫、中国狸花猫、哈士奇、泰迪
暂时不考虑属性，只要考虑行为。
请按照继承的思想特点进行继承体系的设计。

四种动物分别有以下行为：
布偶猫：吃饭、喝水、抓老鼠
中国狸花猫：吃饭、喝水、抓老鼠
哈士奇：吃饭、喝水、看家、拆家
泰迪：吃饭、喝水、看家、蹭一蹭
*/
package Day13.a02extendsdemo02.demo01;


public class Test {
    public static void main(String[] args) {
        //创建哈士奇对象
        HusKy h1 = new HusKy();
        h1.breakHose();
    }
}
