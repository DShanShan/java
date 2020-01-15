package day13.Text3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Text1 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hash = new HashSet<>();
        while (hash.size() < 6) {
            hash.add(rand.nextInt(33) + 1);
        }
        for (Integer num : hash) {
            list.add(num);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(rand.nextInt(16) + 1);
        System.out.println("红色球号为");
        for (Integer num : list) {
            System.out.println(num);
        }
        System.out.println("蓝色球号为");
        for (Integer num : list2) {
            System.out.println(num);
        }

    }
}
