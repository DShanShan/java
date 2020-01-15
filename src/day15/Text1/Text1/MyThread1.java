package day15.Text1.Text1;

public class MyThread1 extends Thread {

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
