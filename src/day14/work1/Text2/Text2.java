package day14.work1.Text2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Text2 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("柳岩", 2100d);
        map.put("张亮", 1700d);
        map.put("诸葛亮", 1800d);
        map.put("灭绝师太", 2600d);
        map.put("东方不败", 3800d);

        double num = map.get("柳岩");
        map.put("柳岩", num + 300);

        Set<String> keys = map.keySet();
        for (String str : keys) {
            System.out.println(str + "=" + map.get(str));
        }

        System.out.println();

        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str+"="+map.get(str));
        }
    }
}
