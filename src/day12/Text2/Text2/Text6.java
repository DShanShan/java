package day12.Text2.Text2;

import java.util.ArrayList;
import java.util.Collections;

public class Text6 {
    public static void main(String[] args) {
        //添加花色
        ArrayList<String> colorCard = new ArrayList<>();
        colorCard.add("♠");
        colorCard.add("♣");
        colorCard.add("♥");
        colorCard.add("♦");
        //添加2-10，AJQK
        ArrayList<String> numberCard = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numberCard.add(i + "");
        }
        numberCard.add("A");
        numberCard.add("J");
        numberCard.add("Q");
        numberCard.add("K");

        ArrayList<String> card = new ArrayList<>();
        card.add("大王");
        card.add("小王");


        for (int i = 0; i < colorCard.size(); i++) {
            for (int j = 0; j < numberCard.size(); j++) {
                card.add(colorCard.get(i) + numberCard.get(j));
            }
        }
        //定义三个玩家
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        //最后三张底牌
        ArrayList<String> hand = new ArrayList<>();
        Boolean flag = true;
        while (flag) {
            //洗牌
            Collections.shuffle(card);
            //发牌
            for (int i = 0; i < card.size(); i++) {
                if (i < card.size() - 3) {
                    if (i % 3 == 0) {
                        play1.add(card.get(i));
                    } else if (i % 3 == 1) {
                        play2.add(card.get(i));
                    } else if (i % 3 == 2) {
                        play3.add(card.get(i));
                    }
                } else {
                    Boolean flag1 = play1.contains("大王");
                    Boolean flag2 = play2.contains("大王");
                    Boolean flag3 = play3.contains("大王");
                    if (flag1) {
                        play1.add(card.get(i));
                    }
                    if (flag2) {
                        play2.add(card.get(i));
                    }
                    if (flag3) {
                        play3.add(card.get(i));
                    }
                    hand.add(card.get(i));
                }
            }
            Boolean flag4 = hand.contains("大王");
            if (flag4) {
                play1.clear();
                play2.clear();
                play3.clear();
                hand.clear();
                continue;
            } else {
                flag = false;
            }
        }


        //牌信息
        System.out.println("牌信息:");
        System.out.println(card.toString());

        //玩家手中的牌
        System.out.println("玩家一：");
        System.out.println(play1);
        System.out.println("玩家二：");
        System.out.println(play2);
        System.out.println("玩家三：");
        System.out.println(play3);
        System.out.println("底牌信息:");
        System.out.println(hand);

    }
}
