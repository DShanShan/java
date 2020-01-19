package day21.Text5;


import java.lang.reflect.Method;
import java.util.Scanner;

public class Text1 {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("ssd");
        Class c=A.class;
        Method m=c.getDeclaredMethod("showString",String.class);
        m.invoke(new A(),str);
    }

}
