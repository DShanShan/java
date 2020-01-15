package day15.Text1.Text1;

public class Text1 {
    public static void main(String[] args) {
        MyThread1 myth=new MyThread1("MyThread1");
        myth.start();

        MyThread2 myth2=new MyThread2();
        Thread thd=new Thread(myth2,"MyThread2");
        thd.start();
    }
}
