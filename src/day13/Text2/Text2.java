package day13.Text2;

import java.util.HashSet;

public class Text2 {
    public static void main(String[] args) {
        HashSet<String> hash=new HashSet<>();
        hash.add("张三");
        hash.add("李四");
        hash.add("王五");
        hash.add("二丫");
        hash.add("钱六");
        hash.add("孙七");
        hash.remove("二丫");
        System.out.println("移出二丫后：");
        for (String str:hash){
            System.out.println(str);
        }
        System.out.println("添加王小丫后：");
        hash.add("王小丫");
        for (String str:hash){
            System.out.println(str);
        }

    }
}
