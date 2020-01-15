package day08.Text1;

public class Student extends Person {

    public Student() {
        this("小张", 30, '女');
    }

    public Student(String name, int age, char sex) {
//        子类的每个构造方法中均有默认的super(),调用父类的空参构造。手动调用父类构造会覆盖默认的super()。
//        super() 和 this() 都必须是在构造方法的第一行，
//        所以不能同时出现。
        super(name, age, sex);
    }

    public void coding() {
        System.out.println(name + "敲代码");
    }

    int num = 20;

    public void method1() {
        int num = 30;
        System.out.println("method的：" + num);
        System.out.println("子类的：" + this.num);
        System.out.println("父类的：" + super.num);
    }

    //方法重写
    public void eat() {
        super.eat();//保留原有的功能
        //添加新功能
        System.out.println("吃吃吃吃吃");
    }

    public void sleep() {

        System.out.println("睡觉睡觉睡觉睡觉睡觉");
    }

    public void sleep2() {
        super.sleep();
        this.sleep();
    }

}
