package day09.Text6;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("工作餐");
    }
}
