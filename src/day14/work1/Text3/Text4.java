package day14.work1.Text3;

import java.util.*;

public class Text4 {
    public static void main(String[] args) {
        //定义花色
        ArrayList<String> color = new ArrayList<>();
        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");

        ArrayList<String> number = new ArrayList<>();
        number.add("2");
        number.add("A");
        number.add("K");
        number.add("Q");
        number.add("J");

        for (int i = 10; i >= 3; i--) {
            number.add(i + "");
        }

        HashMap<Integer,String> map=new HashMap<>();
        int count=1;
        map.put(count,"大王");
        map.put(++count,"小王");


        for (int j = 0; j < number.size(); j++) {
            for (int i = 0; i < color.size(); i++) {
                map.put(++count,color.get(i) + number.get(j));
            }
        }

        Set<Integer>keys=map.keySet();

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(keys);
        System.out.println(list);
        Collections.shuffle(list);

        HashMap<Integer, String> play1 = new HashMap<>();
        HashMap<Integer, String> play2 = new HashMap<>();
        HashMap<Integer, String> play3 = new HashMap<>();
        HashMap<Integer, String> diPai = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            Integer num=list.get(i);
            String str=map.get(num);
            if (i<51){
                if (i%3==0){
                    play1.put(num,str);
                }else if (i%3==1){
                    play2.put(num,str);
                }else if (i%3==2){
                    play3.put(num,str);
                }
            }else {
                    diPai.put(num,str);
            }
        }

        System.out.println("玩家一:");
        sort(play1);
        System.out.println("玩家二:");
        sort(play2);
        System.out.println("玩家三:");
        sort(play3);
        System.out.println("底牌:");
        sort(diPai);


    }
    public static void sort(HashMap<Integer,String> map){
        LinkedHashMap<Integer,String> linked=new LinkedHashMap<>();
        Set<Integer> keys=map.keySet();
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(keys);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            linked.put(list.get(i),map.get(list.get(i)));
        }
        Set<Integer> keys2=linked.keySet();
        for (Integer num:keys2){
            System.out.print(num+"-"+map.get(num)+" ");
        }
        System.out.println();
    }
}
