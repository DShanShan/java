package day14.work1.Text1;

import java.util.HashMap;
import java.util.Set;

public class Text1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "bbb");
        map.put("2", "ddd");
        map.put("3", "fff");
        map.put("4", "hhh");

        System.out.println(map.remove("3"));

        System.out.println(map.get("1"));

        //获取所有的键 获取键集
        Set<String> keys = map.keySet();
        // 遍历键集 得到 每一个键
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + "," + value);
        }

    }
}
