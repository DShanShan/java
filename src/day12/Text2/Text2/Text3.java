package day12.Text2.Text2;

import java.util.ArrayList;
import java.util.List;


public class Text3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("a");
        frequency(list,"a");

    }
    public static void frequency(ArrayList<String> arr,String key){
        int num=0;
        for (String str:arr){
            if (str.equals(key)){
                num+=1;
            }
        }
        System.out.println(key+"在集合中出现了："+num);
    }
}
