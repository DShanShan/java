package day09.Text5;

public class Cat extends Animal {

    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"吃鱼");
    }
}


