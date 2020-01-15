package day12.Text2.Text2.Text5;

import java.util.ArrayList;
import java.util.Iterator;

public class Text5 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 20, 1.80d));
        list.add(new Person("王五", 25, 1.75d));
        list.add(new Person("李四", 19, 1.60d));
        list.add(new Person("张三2", 30, 1.65d));
        list.add(new Person("张三3", 26, 1.70d));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            Person age=it.next();
            age.setAge(age.getAge()+2);

        }
        for (Person p:list){
            System.out.println(p);
        }
    }
}
