package day14.work1.Text1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class Text2 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("张三","男");
        map.put("张三2","女");
        map.put("张三3","女");
        map.put("张三4","男");
        Set<String> key=map.keySet();
        System.out.println("增强for循环：");
        for (String str:key){
            System.out.println("key:"+str+",value:"+map.get(str));
        }
        System.out.println("迭代器：");
        Iterator<String> it=key.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println("key:"+str+",value:"+map.get(str));
        }
    }
}
