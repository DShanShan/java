package day06;

public class Student {
    private String id;
    private String name;
    private double heioght;

    public Student() {
    }

    public Student(String id, String name, double heioght) {
        this.id = id;
        this.name = name;
        this.heioght = heioght;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeioght() {
        return heioght;
    }

    public void setHeioght(double heioght) {
        this.heioght = heioght;
    }
}
