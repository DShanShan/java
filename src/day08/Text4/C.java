package day08.Text4;

public class C extends B {
    int numc=30;
    public void showA(){
        System.out.println("A类中numa:"+numa);
    }

    public void showB(){
        System.out.println("B类中numb:"+numb);
    }

    public void showC(){
        System.out.println("C类中numc:"+this.numc);
    }
}
