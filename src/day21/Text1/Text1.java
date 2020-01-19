package day21.Text1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Text1 {

    @Before
    public void text1(){
        Calculator c=new Calculator();
        System.out.println(c);
    }
    @Test
    public void text(){
        Calculator c=new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.divide(4,3));
        System.out.println(c.minus(5,3));
        System.out.println(c.ride(2,4));
    }

    @After
    public void text2(){
        Calculator c=null;
        System.out.println(c);
    }



}
