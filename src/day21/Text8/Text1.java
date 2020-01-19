package day21.Text8;

import java.lang.reflect.Method;
import java.util.Properties;

public class Text1 {
    public static void main(String[] args) throws Exception{
        Properties p=new Properties();
        p.load(Text1.class.getResourceAsStream("/stu.properties"));
        Class c=Class.forName(p.getProperty("className"));
        Method m=c.getDeclaredMethod("run");
        m.invoke(new DemoClass());
    }
}
