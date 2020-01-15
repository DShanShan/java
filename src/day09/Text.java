package day09;

import day09.Text2.B;
import day09.Text3.BB;
import day09.Text4.NewPhone;
import day09.Text4.OldPhone;
import day09.Text5.Animal;
import day09.Text5.Cat;
import day09.Text5.Dog;
import day09.Text6.*;
import day09.Text7.Code;
import day09.Text7.Company;
import day09.Text7.Manager;
import day09.Text8.*;

public class Text {

    public static void main(String[] args) {
        //第二题
        B b1=new B();
        b1.showA();
        b1.showB();
        System.out.println();

        //第三题
        BB bb=new BB();
        bb.showA();
        bb.showB10();
        bb.showC10();
        System.out.println();

        System.out.println();
        //第四题
        OldPhone op=new OldPhone();
        op.call();
        op.sendMessage();
        NewPhone np=new NewPhone();
        np.call();
        np.sendMessage();
        np.playGame();

        System.out.println();

        //第五题
        Animal d=new Dog();
        d.setName("狗");
        d.eat();
        Animal c=new Cat();
        c.setName("猫");
        c.eat();
        ((Dog) d).lookHome();
        ((Cat) c).catchMouse();

        System.out.println();

        //第六题
        Teacher t1=new Teacher("马云",45);
//        goToSport(t1);
        SportTeacher t2=new SportTeacher("大姚",35);
        goToSport(t2);
        Student s1=new Student("小王",20);
//        goToSport(s1);
        SportStudent s2=new SportStudent("王中王",21);
        goToSport(s2);

        System.out.println();

        //第七题
        Manager m=new Manager("张小强",9000d);
        Code c2=new Code("李小亮",5000d);
        Company c3=new Company(1000000d);
        c3.paySalary(m);
        c3.paySalary(c2);

        System.out.println();

        //第八题
        GouWuChe gouWuChe=new GouWuChe();
        Laptop laptop=new Laptop("g10000","笔记本",10000d);
        Phone phone=new Phone("g10001","手机",5000d);
        Fruit fruit=new Fruit("g10002","苹果",50d);
        System.out.println("===========添加商品==============");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        System.out.println("===========打印商品==============");
        System.out.println("您选购的商品为：");
        gouWuChe.showGood();
        System.out.println("---------------------------------");
        gouWuChe.total();

        System.out.println();

    }

    //第六题
    public static void goToSport(Sport s){
        s.playBasketball();
    }
}
