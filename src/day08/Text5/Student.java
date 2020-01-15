package day08.Text5;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void exmethod(){
        System.out.println(getName()+"同学，考试得了："+score+"分");
    }
}
