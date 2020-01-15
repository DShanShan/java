package day10.Texta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(19);
        list.add(2);
        list.add(16);
        list.add(8);
        list.add(23);

        list.stream().sorted((Integer a, Integer b) -> {
            return b - a;
        }).forEach(System.out::println);

    }

    public static void text4() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //输出前四个
        list.stream().limit(4).forEach(System.out::println);

        //跳过前三个输出
        list.stream().skip(3).forEach(System.out::println);

        //统计个数
        long num = list.stream().count();
        System.out.println(num);
    }

    public static void text3() {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("张无忌");
        list2.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //拼接
        Stream.concat(list.stream(), list2.stream()).forEach(System.out::println);
    }

    public static void text2() {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

       /* //        用与存放stream流转换的list
        List<String> list2= new ArrayList<>();
        list2=list.stream().filter((String n)->{
            return n.startsWith("张") && n.length()==3;
        }).collect(Collectors.toList());

        list2.stream().forEach((String str)->{
            System.out.println(str);
        });*/

        Stream<String> stream = list.stream();
        stream.filter((String s) -> {
            return s.startsWith("张") && s.length() == 3;
        }).forEach(System.out::println);
    }

    public static void text1() {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //        用与存放stream流转换的list
        List<String> list2 = new ArrayList<>();

        //list转换成Stream
        Stream<String> stream = list.stream();

        System.out.println("过滤姓张的");
        Stream<String> stream2 = stream.filter((String s) -> {
            return s.startsWith("张");
        }).filter((String a) -> {
            return a.length() == 3;
        });

        //把stream流转换成list
        list2 = stream2.collect(Collectors.toList());

        //循环遍历
//        list2.stream().forEach(System.out::println);

        for (String str : list2) {
            System.out.println(str);
        }
    }
}
