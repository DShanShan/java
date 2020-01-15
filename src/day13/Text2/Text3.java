package day13.Text2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Text3 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> linked=new LinkedList<>();
        for (String str2:strs){
            linked.add(str2);
        }
        HashSet<String> hash=new HashSet<>();
        hash.addAll(linked);
        linked.clear();
        linked.addAll(hash);


        //增强for循环
        System.out.println("增强for循环：");
        for (String str4:linked){
            System.out.println(str4);
        }
        //迭代器循环
        System.out.println("迭代器循环：");
        Iterator<String> it=linked.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
