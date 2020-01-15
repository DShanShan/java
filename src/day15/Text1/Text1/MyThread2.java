package day15.Text1.Text1;

public class MyThread2 implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
