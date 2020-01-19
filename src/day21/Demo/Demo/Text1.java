package day21.Demo.Demo;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

public class Text1 {

    @Test
    public void text1() throws Exception{
        Properties p=new Properties();
        p.load(Text1.class.getResourceAsStream("/stu.properties"));

        Set<String> key=p.stringPropertyNames();
        Student stu=new Student();
        Class c=Class.forName(p.getProperty("className"));
        key.stream().forEach(n->{
            try {
                Field field=c.getDeclaredField(n);
                field.setAccessible(true);
                Class type=field.getType();
                if (type==Integer.class){
                    field.set(stu,Integer.valueOf(p.getProperty(n)));
                }else if (type==Character.class){
                    field.set(stu,p.getProperty(n).charAt(0));
                }else {
                    field.set(stu,p.getProperty(n));
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
//            System.out.println("key:"+n+",value:"+p.getProperty(n));
        });
        System.out.println(stu);
    }
}
