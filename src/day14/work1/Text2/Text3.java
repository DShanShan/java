package day14.work1.Text2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Text3 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");

        Set<Integer> keys = map.keySet();
        for (Integer num : keys) {
            System.out.println(num + "=" + map.get(num));
        }

        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");

        System.out.println();

        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            int num2=it.next();
            System.out.println(num2 + "=" + map.get(num2));
        }
    }
}
