package day21.Text3;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class Text1 {

    @Test
    public void text() throws Exception{
        Class c=Student.class;
        Student stu2=(Student) c.newInstance();
        stu2.setName("李四");
        stu2.setAge(19);
        System.out.println(stu2);

        Constructor<Student> c3=c.getDeclaredConstructor(String.class,Integer.class);
        Student stu=c3.newInstance("张三",18);
        System.out.println(stu);
    }
}
