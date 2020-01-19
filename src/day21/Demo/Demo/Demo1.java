package day21.Demo.Demo;

import org.junit.*;

public class Demo1 {

    @After
    public void b2(){
        System.out.println("在所有Test方法之后执行");
    }
    @AfterClass
    public static void aClass(){
        System.out.println("在所有测试方法之后运行，运行一次，而且必须用在静态代码块中");
    }

    @Test
    public void a(){
        System.out.println("测试方法");
    }

    @Before
    public void b(){
        System.out.println("在所有Test方法之前执行");
    }

    @BeforeClass
    public static void bClass(){
        System.out.println("在所有测试方法之前运行，运行一次，而且必须用在静态代码块中");
    }
}
