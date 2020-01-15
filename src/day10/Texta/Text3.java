package day10.Texta;

import java.util.Arrays;
import java.util.Comparator;

public class Text3 {
    public static void main(String[] args) {
        Integer[] arr = {54, 7, 24, 35, 79, 23};

       /* Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/

        Arrays.sort(arr, (Integer a, Integer b) -> {
            return b - a;
        });

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
