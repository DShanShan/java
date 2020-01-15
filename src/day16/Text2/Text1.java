package day16.Text2;

public class Text1 {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        baoZi.setName("肉包");
        baoZi.setNum(6);

        new Thread("小二") {
            @Override
            public void run() {
                while (true) {
                    synchronized (baoZi) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (baoZi.getNum() < 10) {
                            baoZi.setNum(baoZi.getNum() + 1);
                            System.out.println("没包子了，" + Thread.currentThread().getName() + "生产了一个包子，剩余包子" + baoZi.getNum());
                            baoZi.notify();
                        } else {
                            try {
                                baoZi.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }.start();

        new Thread("猪八戒") {
            @Override
            public void run() {
                while (true) {
                    synchronized (baoZi) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if (baoZi.getNum() >= 5) {
                            baoZi.setNum(baoZi.getNum() - 1);
                            System.out.println("有包子，" + Thread.currentThread().getName() + "吃了一个包子,剩余包子" + baoZi.getNum());
                            baoZi.notify();
                        } else {
                            try {
                                baoZi.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }.start();
    }
}
