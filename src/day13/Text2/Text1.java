package day13.Text2;

import java.util.ArrayList;
import java.util.HashSet;

public class Text1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        System.out.println("去重之前：");
        for (String str:list){
            System.out.println(str);
        }
        HashSet<String> hash=new HashSet<>();
        hash.addAll(list);
        list.clear();
        list.addAll(hash);
        System.out.println("去重之后：");
        for (String str:list){
            System.out.println(str);
        }
    }
}
