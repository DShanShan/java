package day21.Demo.Demo.Text4;

import java.lang.reflect.Method;

public class Text1 {
    public static void main(String[] args) throws Exception {
        Class c = Text.class;
        Method m = c.getMethod("text");
        MyText mt = m.getAnnotation(MyText.class);
        if (m.isAnnotationPresent(MyText.class)) {

            System.out.println(mt.name());
        }else {
            System.out.println("未使用MyText注解或注解的生命周期不是RUNTIME");
        }
    }
}
