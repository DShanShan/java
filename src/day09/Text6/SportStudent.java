package day09.Text6;

public class SportStudent extends Student implements Sport {

    public SportStudent() {
    }

    public SportStudent(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+" 的学生在打篮球");
    }
}
