package day14.work1.Text2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Text9 {
    public static void main(String[] args) {
        HashMap<String,Double> map=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        while (map.size()<5){
            System.out.println("请输入书名跟价格：");
            String str=scan.next();
            if (str.indexOf(",")!=-1){
                String[] str2=str.split(",");
                map.put(str2[0],Double.parseDouble(str2[1]));
            }
        }

        map.remove("C++");
        map.put("java",38.5);

        Set<String> keys = map.keySet();
        for (String str:keys){
            System.out.println(str+"="+map.get(str));
        }

        System.out.println();

        Set<Map.Entry<String,Double>> entrySet=map.entrySet();
        for (Map.Entry<String,Double> entry:entrySet){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
