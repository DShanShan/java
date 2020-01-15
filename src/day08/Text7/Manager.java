package day08.Text7;

public class Manager extends Staff {
    @Override
    public void eat() {
        System.out.println("工号为："+getNumber()+",姓名为："+getName()+",工资为："+getSalary()+"的经理在吃鱼");
    }

    @Override
    public void job(){
        System.out.println("工号为："+getNumber()+",姓名为："+getName()+",工资为："+getSalary()+"的经理在工资，管理其他人");
    }
}
