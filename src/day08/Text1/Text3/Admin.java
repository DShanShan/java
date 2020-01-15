package day08.Text1.Text3;

import java.util.ArrayList;

public class Admin extends User {

    public Admin() {
    }

    public Admin(String name, Double money) {
        super(name, money);
    }

    @Override
    public void show() {
        System.out.println("群主："+getName()+",余额："+getMoney());
    }

    public ArrayList<Double> fa(Double remoney,int num){
        Double newmoney=getMoney()-remoney;
        ArrayList<Double> list = new ArrayList<>();
        if (newmoney<0){
        }else {
            setMoney(newmoney);
            for (int i = 0; i < num; i++) {
                list.add(remoney / num);
            }
        }
        return list;
    }



}
