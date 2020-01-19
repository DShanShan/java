package day21.Text2;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Text1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<>();
        Class c=list.getClass();
        String str="aaa";
        Method method=c.getMethod("add",Object.class);
        method.invoke(list,"aaa");
        System.out.println(list.get(0));

    }
}
