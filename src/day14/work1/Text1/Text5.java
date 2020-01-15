package day14.work1.Text1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");
        map.put("黄晓明", "Baby");
        map.put("谢霆锋", "张柏芝");

        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        for (Map.Entry<String,String> entry:entrySet){
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }

    }
}
