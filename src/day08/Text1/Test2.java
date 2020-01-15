package day08.Text1;

public class Test2 {
    public static void main(String[] args) {
        Code c = new Code();
        c.mot();
        c.sleep();
    }
}

abstract class Person2 {
    public abstract void sleep();

    public void eat() {
        System.out.println("吃饭");
    }
}

class Code extends Person2 {
    @Override
    public void sleep() {
        System.out.println("睡觉");
    }

    public void eat() {
        System.out.println("吃饭3");
    }

    public void mot() {
        super.eat();
        this.eat();
    }
}