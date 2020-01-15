package day13.Text1;

import java.util.LinkedList;

public class Text2 {
    public static void main(String[] args) {
        LinkedList<String> link=new LinkedList<>();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        link.add("ddd");
        link.addFirst("123");
        link.addLast("456");
        System.out.println("获取集合的第一个元素："+link.getFirst());
        System.out.println("获取集合的最后一个元素："+link.getLast());
        System.out.println("删除集合的第一个元素："+link.removeFirst());
        System.out.println("删除集合的最后一个元素："+link.removeLast());
        for (String str : link){
            System.out.println(str);
        }
    }
}
