package day14.work1.Text3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text1 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("001", "李晨");
        map1.put("002", "范冰冰");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("001", "马云");
        map2.put("002", "马化腾");
        HashMap<String, HashMap<String, String>> map = new HashMap<>();
        map.put("java基础班", map1);
        map.put("java就业班", map2);
        Set<String> keys = map.keySet();
        for (String str:keys){
            System.out.println(str);
            System.out.println(map.get(str));
        }

        System.out.println();

        Set<Map.Entry<String,HashMap<String,String>>> entrySet=map.entrySet();
        for (Map.Entry<String,HashMap<String,String>> entry:entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
