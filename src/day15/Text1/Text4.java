package day15.Text1;

public class Text4 {
    public static void main(String[] args) {
        Runnable run=new Runnable() {
        int num=1;
            @Override
            public void run() {
                while (true) {
                    synchronized (this) {
                        if (num > 100) {
                            System.out.println("水杯卖完了");
                            break;
                        }
                        System.out.println(Thread.currentThread().getName() + "卖出第" + num + "个,总共剩余" + (100 - num) + "个");
                        num++;
                    }
                }
            }
        };

        Thread thd=new Thread(run,"实体店");
        Thread thd2=new Thread(run,"官网");
        thd.start();
        thd2.start();

    }
}
