package day15.Text1;

public class Text5 {
    public static void main(String[] args) {

        Runnable run = new Runnable() {
            int num = 1;
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (num > 80) {
                            System.out.println("车已坐满");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "上车------还剩" + (80 - num) + "个座");
                        num++;
                    }
                }
            }
        };

        Thread th2 = new Thread(run, "中间");
        Thread th1 = new Thread(run, "前门");
        Thread th3 = new Thread(run, "后门");
        th1.start();
        th2.start();
        th3.start();
    }
}
