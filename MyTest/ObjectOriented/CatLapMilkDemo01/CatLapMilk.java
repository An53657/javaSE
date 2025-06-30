package MyTest.objectoriented.catlapMilkdemo01;

import MyTest.string.StringDemo01;

public class CatLapMilk {
    // 成员变量
    // 定义一个类
    private String name;
    private String clothes;
    private String appearance;
    private String character;

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

}