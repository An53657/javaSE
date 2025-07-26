package Day24.doudizhudemo01;

 
import java.util.ArrayList;
import java.util.Collections;

 

public class PokerGame {
    // 牌盒子
    static ArrayList<String> list = new ArrayList<>();

    // 发牌
    static {
        // 准备发牌
        // "♠" "♥" "♣" "♦"
        // 红桃 红桃 梅花 方块
        // "3" "4" "5" "6" "7" "8" "9" "10" "J" "Q" "K" "A" "2"
        String[] colour = { "♠", "♥", "♣", "♦" };
        String[] number = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        for (String c : colour) {
            // c依次表示每一种花色
            for (String n : number) {
                // n依次表示每一个数字
                list.add(c + n);
            }
        }

        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {

 

        // 洗牌
        Collections.shuffle(list);

        System.out.println(list);
        // 发牌
        ArrayList<String> rold = new ArrayList<>();
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String porker = list.get(i);
            if (i < 2) {
                rold.add(porker);
                continue;
            }
            if (i % 3 == 0) {
                play1.add(porker);
            } else if (i % 3 == 1) {
                play2.add(porker);
            } else {
                play3.add(porker);
            }
        }
        // 看牌
        lookPocker("底牌", rold);
        lookPocker("zhangsan", play1);
        lookPocker("wangwu", play2);
        lookPocker("lisi", play3);

    }

    public void lookPocker(String name, ArrayList<String> list) {
        System.out.print(name + " ");

        for (String pocker : list) {
            System.out.print(pocker + "");
        }
        System.out.println("");
    }
}
