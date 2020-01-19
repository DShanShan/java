package day21.Text10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface MyAnno3 {
    String type();
    int[] intArr();
}
