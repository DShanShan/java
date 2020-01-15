package day16.Text2;

public class Text {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();
        bz.setName("肉包");
//        bz.setFlag(0)
        bz.setNum(6);

        Production production=new Production(bz);
        Consume consume=new Consume(bz);

        new Thread(production,"小二").start();
        new Thread(consume,"猪八戒").start();
    }
}
