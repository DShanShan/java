package day15.Text;

public class Text2 {
    public static void main(String[] args) {
        Ticket tk = new Ticket();
        Thread td1 = new Thread(tk, "广州南");
        Thread td2 = new Thread(tk, "深圳北");
        Thread td3 = new Thread(tk, "广州西");

        td1.start();
        td2.start();
        td3.start();
    }
}
