package day14.work1.Text2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Text1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入学生的姓名,年龄：");
        while (true){
            if (map.size()<5){
                String str=scan.next();
                if (str.indexOf(",")!=-1){
                    int num=str.indexOf(",");
                    String key=str.substring(0,num);
                    int value=Integer.parseInt(str.substring(num+1));
                    map.put(key,value);
                }else {
                    System.out.println("你输入的不正确，请重新输入！");
                }
            }else {
                break;
            }
        }

        Set<String> keySet=map.keySet();
        keySet.stream().forEach(n->{
            System.out.println("姓名:"+n+",年龄:"+map.get(n));
        });

    }
}
