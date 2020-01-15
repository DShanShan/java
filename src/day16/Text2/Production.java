package day16.Text2;

public class Production implements Runnable {
    private BaoZi baoZi;

    public Production(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    public BaoZi getBaoZi() {
        return baoZi;
    }

    public void setBaoZi(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (baoZi.getNum()<10){
                    baoZi.setNum(baoZi.getNum()+1);
                    System.out.println("没包子了，"+Thread.currentThread().getName()+"生产了一个包子，剩余包子"+baoZi.getNum());
                    baoZi.notify();
                }else {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
