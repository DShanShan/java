package day10.Text2;

import java.util.ArrayList;

public class Course {
    private String cname;
    String teach;
    String student;

    public Course() {
    }

    public Course(String cname, String teach, String student) {
        this.cname = cname;
        this.teach = teach;
        this.student = student;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void show(ArrayList<Student> stu, ArrayList<Student> w){
        System.out.println("课程名称："+getCname());
        System.out.println("授课老师："+getTeach());
        Teacher t=new Teacher();
        for (int i = 0; i < stu.size(); i++) {
            t.roll(stu.get(i).getName(),w.get(i).getWork());
        }

    }
}
