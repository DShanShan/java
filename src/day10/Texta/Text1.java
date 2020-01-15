package day10.Texta;

public class Text1 {

    public static void main(String[] args) {
        Animal.eat e = new Animal().new eat();
        e.dog();
        e.run();

        Swim swin = new Swim() {
            @Override
            public void swimming() {
                System.out.println("狗刨式游泳");
            }
        };

        swin.swimming();
    }

}
