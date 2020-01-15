package day14.work2.Text1.Text2;

public class Text2 {
    public static void main(String[] args) {
        Student stu=new Student("张三",12);
        stu.setScore(80);
        System.out.println(stu.getScore());
        stu.setScore(-12);
    }
}
