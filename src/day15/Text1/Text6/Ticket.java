package day15.Text1.Text6;

public class Ticket extends Thread {

    int num=100;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("票卖完了");
                    break;
                }
                System.out.println("当前窗口为：" + Thread.currentThread().getName() + "卖了一张票，剩余票数为" + (num - 1));
                num--;
            }
        }
    }
}
