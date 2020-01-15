package day10.Texta;

public class Tex2 {
    public static void main(String[] args) {
/*
        e(()->{
            System.out.println("吃草");
        });*/

        e("大象",(String a)->{
            System.out.println("吃草");
        });

    }

    public static void e(String name,Animal2 animal2){
        animal2.eat(name);
    }
}
