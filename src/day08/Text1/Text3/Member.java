package day08.Text1.Text3;

import java.util.ArrayList;

public class Member extends User {

    public Member() {
    }

    public Member(String name, Double money) {
        super(name, money);
    }


    @Override
    public void show() {
        System.out.println("成员："+getName()+",余额："+getMoney());
    }

    public void shou(ArrayList<Double> list){

        if (list.size()==0){
        }else {
            double rwmoney=list.remove(0);
            setMoney(rwmoney+getMoney());
        }
    }
}
