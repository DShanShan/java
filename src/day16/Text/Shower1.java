package day16.Text;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Shower1 {
    int count = 1;

    public void show1() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (count == 2) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {

                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
                count = 2;
                this.notify();
            }
        }
    }

    public void show2() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (count == 1) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {

                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                }
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("诛");
                System.out.println();
                count = 1;
                this.notify();
            }
        }
    }

    /*ReentrantLock lock = new ReentrantLock();
    Condition c1;
    Condition c2;

    public Shower1() {
        c1 = lock.newCondition();
        c2 = lock.newCondition();
    }

    public void show3() {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            while (count == 2) {
                try {
                    c1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            System.out.print("犯");
            System.out.print("我");
            System.out.print("中");
            System.out.print("华");
            System.out.print("者");
            System.out.println();
            count = 2;
            c2.signal();
            lock.unlock();
        }
    }

    public void show4() {
        for (int i = 0; i < 10; i++) {
            lock.lock();
            while (count == 1) {
                try {
                    c2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
            count = 1;
            c1.signal();
            lock.unlock();
        }
    }*/
}
