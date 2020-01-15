package day08;

import day08.Text7.Chef;
import day08.Text7.Manager;
import day08.Text2.Coder;
import day08.Text2.Teacher;
import day08.Text3.Cat;
import day08.Text3.Dog;
import day08.Text4.C;
import day08.Text5.Student;
import day08.Text5.Teacher2;
import day08.Text6.Cock;
import day08.Text6.Duck;
import day08.Text8.Buyer;
import day08.Text8.Lecturer;
import day08.Text8.Maintainer;
import day08.Text8.Tutor;

public class Text {
    public static void main(String[] args) {
        //第二题
        Coder cd = new Coder();
        cd.setName("马化腾");
        cd.eat();
        cd.sleep();
        cd.code();
        System.out.println("--------------------");
        Teacher tc = new Teacher();
        tc.setName("马云");
        tc.eat();
        tc.sleep();
        tc.teach();

        System.out.println();

        //第三题
        Dog dg = new Dog();
        dg.setName("旺财");
        dg.eat();
        dg.lookHome();
        System.out.println("--------------");
        Cat cat = new Cat();
        cat.setName("波斯猫");
        cat.eat();
        cat.catchMouse();

        System.out.println();

        //第四题
        C c = new C();
        c.showA();
        c.showB();
        c.showC();

        System.out.println();

        //第五题
        Teacher2 tch = new Teacher2();
        tch.setName("王小平");
        tch.setSubject("java");
        tch.method();
        Student std = new Student();
        std.setName("李小乐");
        std.setScore(90);
        std.exmethod();

        System.out.println();

        //第六题
        Cock ck = new Cock();
        ck.setAge(2);
        ck.setColor("红色");
        ck.eat();
        Duck dk = new Duck();
        dk.setAge(1);
        dk.setColor("黑色");
        dk.eat();

        System.out.println();

        //第七题
        Manager m = new Manager();
        m.setNumber("m110");
        m.setName("老王");
        m.setSalary(10000);
        m.eat();
        m.job();
        Chef cf = new Chef();
        cf.setNumber("c110");
        cf.setName("小王");
        cf.setSalary(6000);
        cf.eat();
        cf.job();

        System.out.println();

        //第八题
        Lecturer l = new Lecturer("666","傅红雪");
        l.work();
        Tutor t = new Tutor("668","顾棋");
        t.work();
        Maintainer m2 = new Maintainer("686","庖丁");
        m2.work();
        Buyer b = new Buyer("888","景甜");
        b.work();

        System.out.println();

    }
}
