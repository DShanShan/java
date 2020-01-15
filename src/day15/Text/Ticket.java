package day15.Text;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {

    int num = 100;

    /*@Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println(Thread.currentThread().getName() + ",票卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ",卖票" + num);
                num--;
            }
        }
    }*/

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            //开启锁
            lock.lock();
            if (num <= 0) {
                System.out.println(Thread.currentThread().getName() + ",票卖完了");
                lock.unlock();
                break;
            }
            System.out.println(Thread.currentThread().getName() + ",卖票" + num);
            num--;
            //关闭锁
            lock.unlock();
        }
    }
}
