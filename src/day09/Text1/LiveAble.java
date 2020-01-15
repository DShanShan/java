package day09.Text1;

public interface LiveAble {
    public abstract void eat();

    public abstract void sleep();

    public default void fly() {
        System.out.println("飞");
    }

    public static void run() {
        System.out.println("跑起来");
    }


}
