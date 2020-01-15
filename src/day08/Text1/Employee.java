package day08.Text1;

public abstract class Employee {
    private String id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //抽象方法
    public abstract void work();

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
