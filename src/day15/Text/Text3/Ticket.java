package day15.Text.Text3;

public class Ticket implements Runnable {

    private TicketBean ticketBean;

    public Ticket(TicketBean ticketBean) {
        this.ticketBean = ticketBean;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ticketBean) {
                int num = ticketBean.getNum();
                if (num <= 0) {
                    System.out.println(Thread.currentThread().getName() + "卖完了");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ",车号：" + ticketBean.getName() + ",票号:" + num);
                ticketBean.setNum(--num);
            }
        }
    }
}
