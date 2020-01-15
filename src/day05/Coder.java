package day05;

public class Coder {
    private String name;
    private String number;
    private int pay;

    public Coder() {

    }

    public Coder(String name, String number, int pay) {
        this.name = name;
        this.number = number;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public void intro() {
        System.out.println("程序员姓名：" + name);
        System.out.println("工号：" + number);
    }

    public void showSalary() {
        System.out.println("基本工资为" + pay + ",奖金无");
    }

    public void work() {
        System.out.println("正在努力写代码....");
    }

}
