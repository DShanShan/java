package day16.Text1;

public class Text {
    public static void main(String[] args) {
        Ticket tk = new Ticket();
        tk.setNum(100);
        Runnable run = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (tk) {
                        if (tk.getNum() <= 0) {
                            System.out.println("票卖完了");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "卖了一张票，剩余票数" + (tk.getNum() - 1));
                        tk.setNum(tk.getNum() - 1);

                    }
                }
            }
        };

        new Thread(run, "广州南").start();
        new Thread(run, "深圳南").start();
    }
}
