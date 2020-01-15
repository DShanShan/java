package day13;

import day10.Text4.Apple;
import day10.Text4.CompareAble;
import day13.Text3.Text2.Student;

public class User implements Comparable<User> {
    private String name;
    private Integer age;
    private Double score;

    public User() {
    }

    @Override
    public int compareTo(User o) {
        if (this.getAge() - o.getAge() == 0) {
            return (int) (o.getScore() - this.getScore());
        }
        return this.getAge() - o.getAge();
    }

    public User(String name, Integer age, Double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
