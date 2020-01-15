package day05;

public class Manager {
    private String name;
    private String number;
    private int pay;
    private int bonus;

    public Manager(){

    }
    public Manager(String name, String number, int pay,int bonus){
        this.name=name;
        this.number=number;
        this.pay=pay;
        this.bonus=bonus;
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

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号："+number);
    }

    public void showSalary(){
        System.out.println("基本工资为"+pay+",奖金为"+bonus);
    }

    public void work(){
        System.out.println("正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }

}
