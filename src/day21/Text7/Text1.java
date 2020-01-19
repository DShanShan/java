package day21.Text7;

import java.lang.reflect.Field;

public class Text1 {
    public static void main(String[] args) throws Exception{
        Person p=new Person();
        p.setName("张三");
        System.out.println(p.getName());
        Class c=p.getClass();
        p=(Person) c.newInstance();
        Field f=c.getDeclaredField("age");
        f.setAccessible(true);
        f.set(p,20);
        Object obj=f.get(p);
        System.out.println(obj);
    }
}
