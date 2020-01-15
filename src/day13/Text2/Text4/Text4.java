package day13.Text2.Text4;

import java.util.HashSet;
import java.util.Iterator;

public class Text4 {
    public static void main(String[] args) {
        HashSet<Student> hash=new HashSet<>();
        hash.add(new Student("马云",20,"man"));
        hash.add(new Student("马云1",21,"man"));
        hash.add(new Student("马云2",22,"man"));
        hash.add(new Student("马云",20,"man"));
        hash.add(new Student("马云3",23,"man"));
        hash.add(new Student("马云4",24,"man"));
        hash.add(new Student("马云5",25,"man"));
        hash.add(new Student("马云6",26,"man"));
        hash.add(new Student("马云7",27,"man"));
        hash.add(new Student("马云8",28,"man"));

        System.out.println("使用迭代器输出");
        Iterator<Student> it=hash.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("使用增强for循环输出：");
        for (Student stu:hash){
            System.out.println(stu);
        }

    }
}
