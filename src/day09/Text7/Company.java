package day09.Text7;

public class Company implements Money {
    private Double  total;
    @Override
    public void paySalary(Employee emp) {
        setTotal(getTotal()-emp.getSalary());
        System.out.println("给"+emp.getName()+"发工资 "+emp.getSalary()+" 元，公司剩余： "+getTotal()+"元");
    }

    public Company() {
    }

    public Company(Double total) {
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
