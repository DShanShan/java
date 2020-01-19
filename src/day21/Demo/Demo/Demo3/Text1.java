package day21.Demo.Demo.Demo3;

import org.junit.Test;

import java.lang.reflect.Method;

public class Text1 {

    @Test
    public void text1() throws Exception{
        //获取所有的方法
        Class c=Student.class;
        Method[] methods1=c.getDeclaredMethods();
        System.out.println("获取所有的方法");
        for (Method m:methods1){
            System.out.println(m);
        }
        //获取所有public修饰的成员方法,包括父类
        Method[] methods2=c.getMethods();
        System.out.println("获取所有public修饰的成员方法");
        for (Method m:methods2){
            System.out.println(m);
        }

        System.out.println();

        //根据方法名和参数类型获取成员方法，只能获取public
        Method method1=c.getMethod("sleep");
        System.out.println(method1);

        System.out.println();

        //根据方法名和参数类型获取成员方法，包括private
        Method method2=c.getDeclaredMethod("show",String.class);
        System.out.println(method2);

        System.out.println();

        //暴力反射
        method2.setAccessible(true);
        method2.invoke(new Student(),"张三");


    }

}
