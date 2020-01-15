package day16.Text2;

public class Consume implements Runnable {
    private BaoZi baoZi;

    public Consume(BaoZi baoZi) {
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
                if (baoZi.getNum()>=5){
                    baoZi.setNum(baoZi.getNum()-1);
                    System.out.println("有包子，"+Thread.currentThread().getName()+"吃了一个包子,剩余包子"+baoZi.getNum());
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
