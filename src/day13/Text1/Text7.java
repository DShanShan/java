package day13.Text1;

import java.util.ArrayList;

public class Text7 {
    public static void main(String[] args) {
        ArrayList<String> list=add("acx","asdd","gff");
        for (String str : list){
            System.out.println(str);
        }
    }
    public static ArrayList add(String... str){
        ArrayList<String> list=new ArrayList<>();
        for (String str2:str){
            list.add(str2);
        }
        return list;
    }
}
