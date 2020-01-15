package day13.Text1.Text4;

import java.util.HashSet;


public class Text4 {
    public static void main(String[] args) {
        HashSet<Person> hash=new HashSet<>();
        hash.add(new Person("张三",20));
        hash.add(new Person("李四",23));
        hash.add(new Person("王五",19));
        hash.add(new Person("张三",20));

       for (Person p:hash){
           System.out.println(p);
       }
    }
}
