package day15.Text.Text3;

public class Text2 {
    public static void main(String[] args) {
        TicketBean ticketBean=new TicketBean("G99234",100);
        Ticket ticket=new Ticket(ticketBean);
        Thread thd1 = new Thread(ticket, "广州南");
        Thread thd3 = new Thread(ticket, "武汉");
        Thread thd2 = new Thread(ticket, "深圳北");

        thd1.start();
        thd2.start();
        thd3.start();
    }
}
