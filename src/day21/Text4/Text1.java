package day21.Text4;

import org.junit.Test;

import java.lang.reflect.Method;

public class Text1 {

    @Test
    public void text() throws Exception{
        Class c=Text2.class;
        Method methods=c.getDeclaredMethod("show",String.class);
        methods.setAccessible(true);
        methods.invoke(new Text2(),"abc");

    }
}
