package day09.Text6;

public class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+"岁 "+getName()+" 的老师在打篮球");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
