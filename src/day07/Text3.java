package day07;

import java.util.ArrayList;

public class Text3 {
    public static void main(String[] args) {
        //[User{name='马云', age=56, money=2500.0}, User{name='马化腾', age=56, money=2400.0}, User{name='马赛克', age=56, money=2500.0}]
        ArrayList<User> u=new ArrayList<>();
        u.add(new User("马云",56,2500));
        u.add(new User("马化腾",56,2400));
        u.add(new User("马赛克",56,2500));
        System.out.println(u.toString());
        ArrayList<String> list=new ArrayList<>();
        for (int i = 0; i < u.size(); i++) {
            int a2=u.toString().indexOf("name=",1);
            String b2=u.get(i).toString().substring(a2+4,a2+4+3).replace(",","");
            list.add(b2);
        }
        System.out.println(list);
    }
}
