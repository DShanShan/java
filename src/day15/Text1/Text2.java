package day15.Text1;

public class Text2 {
    public static void main(String[] args) {
        Thread thd1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        });

        Thread thd2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("显示画面");
                }
            }
        });

        thd1.start();
        thd2.start();
    }
}
