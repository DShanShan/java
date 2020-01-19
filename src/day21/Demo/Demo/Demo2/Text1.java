package day21.Demo.Demo.Demo2;

import java.lang.reflect.Constructor;

public class Text1 {
    public static void main(String[] args) throws Exception {
        Class c = Student.class;
//        获取所有的public修饰的构造方法
        Constructor[] ct = c.getConstructors();
        System.out.println("获取所有的public修饰的构造方法");
        for (Constructor c2 : ct) {
            System.out.println(c2);
        }
        //获取所有构造方法
        Constructor[] constructors1 = c.getDeclaredConstructors();
        System.out.println("获取所有的构造方法");
        for (Constructor c2 : constructors1) {
            System.out.println(c2);
        }

        //根据参数类型获取构造方法对象，只能获得public修饰的构造方法。
        Constructor<Student> constructor2 = c.getConstructor(String.class, Integer.class);

        System.out.println("根据参数类型获取构造方法对象");
        System.out.println(constructor2);


//        根据参数类型获取构造方法对象，能获取所有的构造方法，包括private修饰的构造方法。
        Constructor<Student> constructor3 = c.getDeclaredConstructor(String.class);
        System.out.println("根据参数类型获取构造方法对象，能获取所有的构造方法，包括private修饰的构造方法");
        System.out.println(constructor3);

        constructor3.setAccessible(true);
        Student stu=constructor3.newInstance("李四");
        System.out.println(stu);


    }

    public static void text1() {
        //1.获取对象的三种方式
        //1.
        Class c = Student.class;

        //2.
        Student stu = new Student();
        Class c2 = stu.getClass();

        //3.
        Class c3 = null;
        try {
            c3 = Class.forName("day21.Demo.Demo.Demo2.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c3);
        System.out.println("完整的类名路径：" + c3.getName());
        System.out.println("类名：" + c3.getSimpleName());

        try {
            Student stu2 = (Student) c3.newInstance();
            System.out.println("name：" + stu2.getName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
