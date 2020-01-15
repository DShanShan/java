package day13.Text3.Text2;

import java.util.Collections;
import java.util.HashSet;

public class Text2 {
    public static void main(String[] args) {
        HashSet<Student> hash1=new HashSet<>();
        hash1.add(new Student("张三1",20));
        hash1.add(new Student("张三2",25));
        hash1.add(new Student("张三1",20));
        hash1.add(new Student("张三3",18));

        HashSet<Student> hash2=new HashSet<>();
        hash2.add(new Student("李四1",20));
        hash2.add(new Student("李四2",25));
        hash2.add(new Student("李四1",20));
        hash2.add(new Student("李四3",18));

        HashSet<HashSet<Student>> hashSets=new HashSet<>();
        Collections.addAll(hashSets,hash1,hash2);

        System.out.println("增强for循环：");
        for (HashSet<Student> stu:hashSets){
            System.out.println(stu);
        }

        System.out.println("stream流：");
        hashSets.stream().forEach(System.out::println);

    }
}
