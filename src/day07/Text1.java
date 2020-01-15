package day07;

import java.util.ArrayList;

public class Text1 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.length());
        String str2 = str.concat("_Java");
        System.out.println(str2);
        char c1 = str2.charAt(0);
        char c2 = str2.charAt(1);
        System.out.println(c1);
        System.out.println(c2);
        int a = str.indexOf("o");
        int b = str.indexOf("l");
        int c = str.indexOf("ll");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        String sub1 = str.substring(5);
        System.out.println(sub1);
        String sub2 = str.substring(2, 4);
        System.out.println(sub2);

        char[] chs = {'A', 'B', 'C', 'D', 'E'};
        String str3 = new String(chs);
        System.out.println(str3);

        String str4 = new String("hello");
        System.out.println(str4.substring(str4.length()-1));
        System.out.println("o".equals(str4.substring(str4.length()-1))? "str4字符串是否以o后缀结尾："+true:"str4字符串是否以o后缀结尾："+false);


        //随机发红包



    }
}
