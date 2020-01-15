package day14.work2.Text1.Text2;

public class Student {
    private String name;
    private Integer score;

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        if (score < 0) {
            throw new NoScoreException("分数不能为负数：" + score);
        }
            this.score = score;
    }
}
