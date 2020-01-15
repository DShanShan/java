package day08.Text6;

public abstract class Fowl {
    private int age;
    private String color;

    public abstract void eat();

    public Fowl() {
    }

    public Fowl(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
