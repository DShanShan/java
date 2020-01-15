package day12.Text2.Text2.Text4;

import java.util.ArrayList;

public class Text4 {
    public static void main(String[] args) {

        ArrayList<String> list1=new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        swap(0,2,list1);

        System.out.println();

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        swap(0,2,list2);



    }
    public static<E> void swap(Integer a,Integer b,ArrayList<E> list){
        E temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
        list.stream().forEach(System.out::println);
    }
}
