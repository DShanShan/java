package day16.Text;

public class Text {
    public static void main(String[] args) {
        Shower1 s=new Shower1();

        new Thread(){
            @Override
            public void run() {
                s.show1();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                s.show2();
            }
        }.start();

        /*new Thread(){
            @Override
            public void run() {
                s.show3();
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                s.show4();
            }
        }.start();*/
    }
}
