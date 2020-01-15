package day12.Text2.Text2.Text2;


import java.util.ArrayList;
import java.util.Iterator;

public class Text2 {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("张三",20,1.80d));
        list.add(new Person("王五",25,1.75d));
        list.add(new Person("李四",19,1.60d));
        list.add(new Person("张三2",30,1.65d));
        list.add(new Person("张三3",26,1.70d));
        Double height=0d;
        Double max=list.get(0).getHeight();
        Double mix=list.get(0).getHeight();
        Iterator<Person> it=list.iterator();
        while (it.hasNext()){
            Double num=it.next().getHeight();
            height+=num;
            if (num>max){
                max=num;
            }
            if (num<mix){
                mix=num;
            }
        }
        System.out.println(max);
        System.out.println(mix);
        for (int i = 0; i < list.size(); i++) {
            if (max==list.get(i).getHeight()){
                System.out.println("最高的人是"+list.get(i).getName()+",身高"+list.get(i).getHeight());
            }
            if (mix==list.get(i).getHeight()){
                System.out.println("最矮的人是"+list.get(i).getName()+",身高"+list.get(i).getHeight());
            }
        }
    }
}
