package day09.Text5;

public class Dog extends Animal {

    public void lookHome(){
        System.out.println("老老实实看家");
    }
    @Override
    public void eat() {
        System.out.println(getName()+"吃骨头");
    }
}
