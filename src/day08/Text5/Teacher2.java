package day08.Text5;

public class Teacher2 extends Person {
    private String subject;

    public Teacher2() {
    }

    public Teacher2(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void method(){
        System.out.println(getName()+"老师,讲授"+subject+"课");
    }
}
