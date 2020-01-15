package day10.Text2;

public class Student {
    private String name;
    private Boolean work;

    public Student() {
    }

    public Student(String name, Boolean work) {
        this.name = name;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
    }
}
