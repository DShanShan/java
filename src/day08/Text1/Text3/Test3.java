package day08.Text1.Text3;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        Admin a=new Admin("老板",300d);
        a.show();
        ArrayList list=a.fa(450d,3);
        if (list.size()==0){
            System.out.println("余额不足，抢红包失败");
        }
        Member m=new Member("小李",50d);
        Member m2=new Member("小王",20d);
        Member m3=new Member("小黄",150d);
        m.shou(list);
        m2.shou(list);
        m3.shou(list);
        m.show();
        m2.show();
        m3.show();
    }

}