package day12.Text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Text1 {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("张三1");
        coll.add("张三2");
        coll.add("张三3");

//        清空集合中所有元素
//        coll.clear();
        coll.remove("张三");
        System.out.println(coll.contains("张三2"));
        System.out.println(coll.contains("张三5"));
        System.out.println(coll.isEmpty());
        System.out.println(coll.size());

        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        //增强for循环
        for (String str : coll) {
            System.out.println(str);
        }

        coll.stream().forEach(System.out::println);

        System.out.println();

        Collection<String> coll2 = new ArrayList<>();
        coll2.add("李四");
        coll2.add("李四1");
        coll2.add("李四2");
        coll2.add("李四3");

        //获取coll2的迭代器
        Iterator<String> it = coll2.iterator();
        //判断迭代器中是否有下一个元素
        while (it.hasNext()) {
            //获取迭代器中的元素
            //next()返回当前指针指向的元素，把当前指针往后移
            String name = it.next();//执行完了以后指针后移
            System.out.println(name);
        }

        System.out.println();

        Collection<Person> coll3 = new ArrayList<>();
        coll3.add(new Person("王五1", 20));
        coll3.add(new Person("王五2", 25));
        coll3.add(new Person("王五3", 15));
        coll3.add(new Person("王五4", 30));

        for (int i = 0; i < coll3.size(); i++) {
            System.out.println(((ArrayList<Person>) coll3).get(i).toString());
        }

        /*for (Person p : coll3) {
            System.out.println(coll3.toString());
        }*/

       /* coll3.stream().forEach(System.out::println);

        Iterator<Person> it2 = coll3.iterator();
        while (it2.hasNext()) {
            Person p2 = it2.next();
            System.out.println(p2);
        }*/

    }
}
