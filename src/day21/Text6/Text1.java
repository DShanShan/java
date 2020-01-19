package day21.Text6;

import java.lang.reflect.Field;

public class Text1 {
    public void setProperty(Object obj, String propertyName, Object value) throws Exception {
        Class c=obj.getClass();
        Field f=c.getDeclaredField(propertyName);
        f.setAccessible(true);
        f.set(obj,value);
    }

    public Object getProperty(Object obj, String propertyName) throws Exception{
        Class c=obj.getClass();
        Field f=c.getDeclaredField("propertyName");
        f.setAccessible(true);
        f.set(obj,"aaa");
        Object obj2=f.get(obj);
        return obj2;
    }
}
