package MyTest.ObjectOrientedDemo.CatLapMilkDemo01;

import MyTest.String.StringDemo01;

public class CatLapMilk {
    // 成员变量
    // 定义一个猫娘类
    private String name;// 名字
    private String clothes;// 服装
    private String appearance;// 外貌
    private String character;// 性格·

    // 构造方法 无参构造 有参构造
    public CatLapMilk() {
    }

    public CatLapMilk(String name, String clothes, String appearance, String character) {
        this.name = name;
        this.clothes = clothes;
        this.appearance = appearance;
        this.character = character;

    }

    // get set 方法了
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getClothes() {
        return clothes;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    // 成员方法
    public void playGema() {
        System.out.println(StringDemo01.PLAYGAME_BLUEARCHE);

    }

    public String interaction() {
        return name + "";

    }
}