package day14.work1.Text2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Text7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入英文语句：");
        String str = scan.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String[] str2 = str.split(" ");
        for (int i = 0; i < str2.length; i++) {
            if (!map.containsKey(str2[i])) {
                map.put(str2[i], 1);
            } else {
                int count = map.get(str2[i]);
                map.put(str2[i], ++count);
            }
        }

        Set<String> keys = map.keySet();
        keys.stream().forEach(n -> {
            System.out.println(n + "=" + map.get(n));
        });
    }
}
