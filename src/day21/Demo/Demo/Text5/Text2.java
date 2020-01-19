package day21.Demo.Demo.Text5;

import java.lang.reflect.Method;

public class Text2 {
    public static void main(String[] args) throws Exception {
        Class c = Text1.class;
        Method[] methods = c.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(MyText.class)) {
                m.invoke(new Text1());
            }
        }
    }
}
