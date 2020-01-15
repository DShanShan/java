package day09.Text6;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生餐");
    }
}
