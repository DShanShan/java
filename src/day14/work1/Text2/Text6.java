package day14.work1.Text2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Text6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("123");
        list.add("bcd");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String str : list) {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                    if (!map.containsKey(chars[i])) {
                        map.put(chars[i], 1);
                    } else {
                        int count = map.get(chars[i]);
                        map.put(chars[i], ++count);
                    }
                }
            }
        }

        Set<Character> keys = map.keySet();
        keys.stream().forEach(n -> {
            System.out.println(n + "=" + map.get(n));
        });
    }
}
