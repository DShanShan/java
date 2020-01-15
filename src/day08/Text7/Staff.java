package day08.Text7;

public abstract class Staff {
    private String number;
    private String name;
    private double salary;

    public abstract void job();

    public abstract void eat();

    public Staff() {
    }

    public Staff(String number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
