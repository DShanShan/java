package day15.Text1;

public class Text7 {
    public static void main(String[] args) {
        Thread th1=new Thread(new Runnable() {
            int num=1;
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    num*=i;
                }
                System.out.println("10的阶乘："+num);
            }
        });

        Thread th2=new Thread(new Runnable() {
            int num=1;
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    num*=i;
                }
                System.out.println("5的阶乘："+num);
            }
        });

        Thread th3=new Thread(new Runnable() {
            int num=1;
            @Override
            public void run() {
                for (int i = 1; i <= 8; i++) {
                    num*=i;
                }
                System.out.println("8的阶乘："+num);
            }
        });
        th1.start();
        th2.start();
        th3.start();

    }
}
