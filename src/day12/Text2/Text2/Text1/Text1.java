package day12.Text2.Text2.Text1;

import java.util.ArrayList;
import java.util.Iterator;

public class Text1 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student("张三",20,80d));
        list.add(new Student("李四",25,70.5d));
        list.add(new Student("王五",19,85d));
        list.add(new Student("张三2",30,65d));
        list.add(new Student("张三3",26,90d));
        Double score=0d;
        Double max=list.get(0).getScore();
        Double mix=list.get(0).getScore();
        Iterator<Student> it=list.iterator();
        while (it.hasNext()){
            Double num=it.next().getScore();
            score+=num;
            if (num>max){
                max=num;
            }
            if (num<mix){
                mix=num;
            }
        }
        Double age=score/list.size();
        System.out.println("总分："+score);
        System.out.println("最高分"+max);
        System.out.println("最低分"+mix);
        System.out.println("平均分："+age);

    }
}
