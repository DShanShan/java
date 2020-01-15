package day13.Text1;

import java.util.HashSet;
import java.util.Iterator;

public class Text3 {
    public static void main(String[] args) {
        HashSet<String> hash=new HashSet<>();
        hash.add("zhangsan");
        hash.add("lisi");
        hash.add("wangwu");
        hash.add("zhangsan");
        Iterator<String> it=hash.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
