package day12.Text2.Text1;

import java.util.ArrayList;
import java.util.Iterator;

public class Text1 {
    public static void main(String[] args) {

        //1.使用迭代器获取ArrayList集合里面的元素
        ArrayList<String> list1=new ArrayList<>();
        list1.add("abc1");
        list1.add("abc2");
        list1.add("abc3");
        list1.add("abc4");

        System.out.println("使用迭代器获取ArrayList集合里面的元素");
        Iterator<String> it1=list1.iterator();
        while (it1.hasNext()){
            String str=it1.next();
            System.out.println(str);
        }

        System.out.println();

        //2.使用增强for循环
        System.out.println("使用增强for循环int[]里面的元素");
        int[] num1={11,22,33};
        for (int n:num1){
            System.out.println(n);
        }

        System.out.println();

        //3.使用增强for循环遍历ArrayList中的元素
        ArrayList<String> list2=new ArrayList<>();
        list2.add("xiaomi");
        list2.add("xiaomi2");
        list2.add("xiaomi3");
        list2.add("xiaomi4");
        System.out.println("使用增强for循环遍历ArrayList中的元素");
        for (String str:list2){
            System.out.println(str);
        }

        System.out.println();

        //4.泛型
        System.out.println("泛型");
        function("abc");
        function(123);
        function(12.3d);

        //5.泛型接口

    }
    public static <T>  void function(T t){
        System.out.println(t);
    }
}
