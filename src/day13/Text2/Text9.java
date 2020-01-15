package day13.Text2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Text9 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        Collections.addAll(list1,"a","b","a","c","d");
        ArrayList<String> list2=new ArrayList<>();
        Collections.addAll(list2,"e","f","a","d","g");
        HashSet<String> hash=new HashSet<>();
        for (String str:list1){
            hash.add(str);
        }
        for (String str:list2){
            hash.add(str);
        }
        System.out.println("两个集合去重后的元素：");
        for (String str:hash){
            System.out.println(str);
        }

    }
}
