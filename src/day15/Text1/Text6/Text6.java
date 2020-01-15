package day15.Text1.Text6;

public class Text6 {
    public static void main(String[] args) {
        Ticket tk=new Ticket();
        Thread th1=new Thread(tk,"窗口a");
        Thread th2=new Thread(tk,"窗口b");
        Thread th3=new Thread(tk,"窗口c");
        Thread th4=new Thread(tk,"窗口d");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
