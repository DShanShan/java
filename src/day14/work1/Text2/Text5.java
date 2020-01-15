package day14.work1.Text2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Text5 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')) {
                countingKey(map, "字母");
            } else if (chars[i] == ' ') {
                countingKey(map, "空格");
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                countingKey(map, "数字");
            } else {
                countingKey(map, "其他");
            }
        }

        Set<String> keys = map.keySet();
        keys.stream().forEach(n -> {
            System.out.println(n + "=" + map.get(n));
        });
    }

    public static void countingKey(HashMap<String, Integer> map, String key) {
        if (!map.containsKey(key)) {
            map.put(key, 1);
        } else {
            int count = map.get(key);
            map.put(key, ++count);
        }

    }
}
