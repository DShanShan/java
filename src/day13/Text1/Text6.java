package day13.Text1;

import java.util.ArrayList;
import java.util.Collections;

public class Text6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        System.out.println("排序：");
        Collections.sort(list);
        for (Integer num:list){
            System.out.println(num);
        }
        System.out.println("随机打乱后的：");
        Collections.shuffle(list);
        for (Integer num:list){
            System.out.println(num);
        }
        System.out.println("反转：");
        Collections.reverse(list);
        for (Integer num:list){
            System.out.println(num);
        }
    }
}
