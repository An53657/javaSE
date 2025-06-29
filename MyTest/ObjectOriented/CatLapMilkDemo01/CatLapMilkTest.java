package MyTest.objectoriented.catlapMilkdemo01;

import MyTest.string.StringDemo01;

public class CatLapMilkTest {
    public static void main(String[] args) {
        // 创建一个无参的新对象
        CatLapMilk cat1 = new CatLapMilk();
        cat1.setName(StringDemo01.NAME);
        System.out.println(StringDemo01.NAME_ONE + ":" + cat1.getName());
        cat1.setClothes(StringDemo01.CLOTHES);
        System.out.println(StringDemo01.CLOTHES_ONE + ":" + cat1.getClothes());
        cat1.setAppearance(StringDemo01.APPEARANCE);
        System.out.println(StringDemo01.APPEARANCE_ONE + ":" + cat1.getAppearance());
        cat1.setCharacter(StringDemo01.CHARACTER);
        System.out.println(StringDemo01.CHARACTER_ONE + ":" + cat1.getCharacter());

        // //方法

        // 定义一个变量存储干的事情
        String thing = StringDemo01.PLAYGANW_MINECRAFT;
        System.out.println(StringDemo01.DOING + ":" + thing);

    }
}
