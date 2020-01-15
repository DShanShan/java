package day13.Text2.Text10;

import java.util.HashSet;
import java.util.Iterator;

public class Text10 {
    public static void main(String[] args) {
        HashSet<Student> hash=new HashSet<>();
        hash.add(new Student("马云",20,90d));
        hash.add(new Student("马云1",21,70d));
        hash.add(new Student("马云2",22,75d));
        hash.add(new Student("马云",20,90d));
        hash.add(new Student("马云3",23,85d));

        Iterator<Student> it=hash.iterator();
        double sum=0;
        double max=0;
        double min=0;
        while (it.hasNext()){
            Student stu=it.next();
            max=stu.getScore();
            min=stu.getScore();
        }
        for (Student stu2:hash){
            sum+=stu2.getScore();
            if (max<stu2.getScore()){
                max=stu2.getScore();
            }
            if (min>stu2.getScore()){
                min=stu2.getScore();
            }
        }
        double avg=sum/hash.size();
        System.out.println("总分为"+sum);
        System.out.println("平均分为"+avg);
        System.out.println("最大值为"+max);
        System.out.println("最小值为"+min);
    }
}
