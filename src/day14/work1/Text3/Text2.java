package day14.work1.Text3;

import java.util.HashMap;
import java.util.Set;

public class Text2 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("及时雨","宋江");
        map.put("玉麒麟","卢俊义");
        map.put("智多星","吴用");
        map.put("入云龙","公孙胜");
        map.put("豹子头","林冲");
        map.remove("玉麒麟");
        map.put("智多星",null);
        map.put("呼保义","宋江");
        map.remove("及时雨");
        if (map.containsKey("及时雨")){

        }
        Set<String>keys=map.keySet();
        for (String str:keys){
            System.out.println(str+"="+map.get(str));
        }

    }
}
