package day08.Text7;

public class Chef extends Staff {
    @Override
    public void eat() {
        System.out.println("工号为："+getNumber()+",姓名为："+getName()+",工资为："+getSalary()+"的厨师在吃肉");
    }

    @Override
    public void job(){
        System.out.println("工号为："+getNumber()+",姓名为："+getName()+",工资为："+getSalary()+"的经理在工作，炒菜");
    }
}
