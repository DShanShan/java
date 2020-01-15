package day14.work1.Text2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Text4 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int count = map.get(c);
                map.put(c, ++count);
            }
        }

        Set<Character> keys = map.keySet();
        keys.stream().forEach(n->{
            System.out.print(n+"("+map.get(n)+")");
        });
        System.out.println();

    }
}
