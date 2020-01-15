package day09.Text1;

public class Text1 {
    public static void main(String[] args) {
        Animal1 a = new Animal1();
        a.eat();
        a.sleep();
        a.fly();
//        a.run();//无法继承接口的静态方法
        LiveAble.run();
        Text2 t=new Text2();
        t.show();
        t.showA();
        t.showB();

    }


}
