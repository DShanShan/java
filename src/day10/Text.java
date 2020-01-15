package day10;

import day10.Text1.HandleAble;
import day10.Text2.Course;
import day10.Text2.Student;
import day10.Text2.Teacher;
import day10.Text3.Filter;
import day10.Text3.Recept;
import day10.Text3.User;
import day10.Text4.Apple;
import day10.Text4.CompareAble;
import day10.Text4.Worker;
import day10.Text5.FightAble;
import day10.Text5.Player;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {

        //第一题
        HandleAble h = new HandleAble() {
            @Override
            public void HandleAble(String num) {
                Double str = Double.parseDouble(num);
                System.out.println("原数字：" + num);
                System.out.println("取整后：" + Math.round(str));
                System.out.println("保留4为小数后:" + Math.round(str * 10000) * 0.0001);
            }
        };
        h.HandleAble("23.23456789");

        System.out.println();

        //第二题
        Student s1 = new Student("小红", true);
        Student s2 = new Student("小亮", true);
        Student s3 = new Student("小明", false);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Teacher teacher = new Teacher("张老师");
        Course course = new Course();
        course.setCname("java");
        course.setTeach(teacher.getTname());
        for (int i = 0; i < list.size(); i++) {
            course.setStudent(list.get(i).getName());
        }
        course.show(list, list);

        System.out.println();

        //第三题
        ArrayList<User> list2 = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            User u = new User();
            u.setId(i + 1);
            list2.add(u);
        }

        System.out.println("未分组：");
        System.out.println(list2);

        System.out.println("已分组：");
        Recept recept1 = new Recept();

        /*
        recept1.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId()>=10&&u.getId()<=19){
                    u.setType("v1");
                }
            }
        });

        for (int i = 0; i < list2.size(); i++) {
            User u=list2.get(i);
            recept1.filterUser(u);
        }


        Recept recept2=new Recept();
        recept2.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                if (u.getId()>=20&&u.getId()<=29){
                    u.setType("v2");
                }
            }
        });

        Recept recept3=new Recept();
        recept3.setF(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("A");
            }
        });*/

       /* for (int i = 0; i < list2.size(); i++) {
            User user=list2.get(i);
            recept1.filterUser(user);
            recept2.filterUser(user);
            recept3.filterUser(user);
        }*/
        for (int i = 0; i < list2.size(); i++) {
            User us = list2.get(i);
            if (us.getId() % 9 == 0) {
                recept1.recept(us);
                System.out.println();
            } else {
                recept1.recept(us);
            }
        }

        System.out.println();
        System.out.println();

        //第四题
        Worker w = new Worker();
        Apple a1 = new Apple(5d, "青色");
        Apple a2 = new Apple(3d, "红色");

        CompareAble c = new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {
                System.out.println(a1.getSize() > a2.getSize() ? a1.getSize() + "-" + a1.getColor() : a2.getSize() + "-" + a2.getColor());
            }
        };
        System.out.println("默认挑大的：");
        c.compare(a1, a2);
        System.out.println("挑红的：");
        w.pickApple(new CompareAble() {
            @Override
            public void compare(Apple a1, Apple a2) {
                System.out.println("红色".equals(a1.getColor()) ? a1.getSize() + "-" + a1.getColor() : a2.getSize() + "-" + a2.getColor());
            }
        }, a1, a2);

        System.out.println();

        //第五题
        Player p = new Player();
        p.select("法术角色");

        System.out.println("===================");
        p.select("武力角色");

        System.out.println();


    }
}
