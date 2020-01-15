package day13.Text1;

import java.util.LinkedList;

public class Text1 {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<>();
        link.add("abc");
        link.add("bbb");
        link.add("ccc");
        link.add("ddd");
        link.set(1,"eee");
        System.out.println(link.size());
        System.out.println(link.get(2));
        System.out.println();
        link.remove("ddd");
        for (String str:link){
            System.out.println(str);
        }
        System.out.println();
        link.clear();
        for (String str:link){
            System.out.println(str);
        }
    }
}
