package day13.Text2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Text6 {
    public static void main(String[] args) {
        HashSet<Integer> hash=new HashSet<>();
        Random rand=new Random();
        while (hash.size()<10){
            int num=rand.nextInt(20)+1;
            hash.add(num);
        }

        Iterator<Integer> it=hash.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
