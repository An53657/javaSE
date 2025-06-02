package MyTest.ObjectOrientedDemoo.CatLapMilkDemo01;

import MyTest.String.StringDemo01;

public class CatLapMilkTest {
    public static void main(String[] args) {
        // 创建一个无参的新对象
        CatLapMilk cat1 = new CatLapMilk();
        // 名字
        cat1.setName(StringDemo01.NAME);
        System.out.println(StringDemo01.NAME_ONE+ ":" + cat1.getName());
        // 服装
        cat1.setClothes(StringDemo01.CLOTHES);
        System.out.println(StringDemo01.CLOTHES_ONE +":" + cat1.getClothes());
        // 外貌
        cat1.setAppearance(StringDemo01.APPEARANCE);
        System.out.println(StringDemo01.APPEARANCE_ONE+":" + cat1.getAppearance());
        // 性格
        cat1.setCharacter(StringDemo01.CHARACTER);
        System.out.println(StringDemo01.CHARACTER_ONE+":" + cat1.getCharacter());

        // //方法
        // //在打游戏
        // 定义一个变量存储干的事情 
        String thing = cat1.interaction();
        thing = StringDemo01.PLAYGANW_MINECRAFT;
        System.out.println("在做什么 : " + thing);

        // cat1.interaction();

    }
}
