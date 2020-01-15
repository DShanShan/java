package day08.Text1;

public class Text1 {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="小明";
        s.age=20;
        s.eat();
        s.sleep();
        s.coding();
//        s.sex='男';//子类无法继承父类私有的成员
        s.setSex('男');//可以通过set方法设置值(前提是set方法没有被私有)
//        s.method1();//子类不能继承父类私有的方法
        s.method2();
        s.method1();
        s.sleep2();

        Teacher  t=new Teacher();
        t.name="李老师";
        t.age=30;
        t.eat();
        t.sleep();
        t.teach();


        //抽象类
        Manager m=new Manager();
        m.work();
        Cook c=new Cook();
        c.work();




    }
}
