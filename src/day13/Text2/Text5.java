package day13.Text2;

import java.util.ArrayList;
import java.util.HashSet;

public class Text5 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> hash=new HashSet<>();
        for (String str: arr){
            hash.add(str);
        }

        ArrayList<String> list=new ArrayList<>();
        for (String str:hash){
            list.add(str);
        }

        for (String str:list){
            System.out.println(str);
        }
    }
}
