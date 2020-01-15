package day02;

public class Text1 {
    public static void main(String[] args) {

        //求面积跟周长
        int height = 4;
        int width = 6;
        int area = height * width;
        int perimeter = (height + width) * 2;
        System.out.println("面积为" + area);
        System.out.println("周长为" + perimeter);
        System.out.println();


        //第二题
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        System.out.println("byte类型b1和b2的和为：");
        System.out.println(b3);
        short s1 = 1000;
        short s2 = 2000;
        int s3 = s1 + s2;
        System.out.println("short类型s1和s2的和为：");
        System.out.println(s3);
        System.out.println();

        //第三题
        int i1 = 100;
        long l1 = 200;
        int add = i1 + (int) l1;
        System.out.println("add的值为：" + add);
        long l2 = 1000;
        float f2 = 200.22f;
        double add2 = l2 + f2;
        System.out.println("add2的值为：" + add2);
        int i3 = 200;
        double d3 = 130.45;
        double add3 = i3 + d3;
        System.out.println("add3的值为：" + add3);
        System.out.println();


        //第四题
        int a1 = 10;
        int a2 = 11;
        if (a1 % 2 == 0) {
            System.out.println("10是偶数？" + true);
        }
        if (a2 % 2 != 0) {
            System.out.println("11是偶数？" + false);
        }
        int b4 = 12;
        int b5 = 13;
        if (b4 % 2 == 0) {
            System.out.println("12是奇数？" + false);
        }
        if (b5 % 2 != 0) {
            System.out.println("13是奇数？" + true);
        }
        System.out.println();

        //第五题
        printNum();
        System.out.println();
        //第六题
        printString();
        System.out.println();
        //第七题
        add();
        sub();
        mul();
        div();
        remain();
        System.out.println();
        //第八题
        char ch = 'J';
        ch = (char) (32 + (int) ch);
        System.out.println(ch);
        char ch2 = 'a';
        ch2 = (char) ((int) ch2 - 32);
        System.out.println(ch2);

        double d4 = 53.4;
        int i4 = 40;
        double sum3 = d4 + i4;
        System.out.println("sum3的值：" + sum3);
        System.out.println("sum3的整数部分：" + (int) sum3);
        double d5 = 63.4;
        int i5 = 50;
        int mul4 = (int) d5 * i5;
        System.out.println("mul4的整数部分：" + mul4);
    }

    public static void printNum() {
        float f1 = 12345.01f;
        float f2 = 12345.00f;
        float var1 = (float) (f1 > f2 ? 12456 : 12456.02);
        float var2 = var1 + 1024;
        System.out.println("var1的值为：" + var1);
        System.out.println("var2的值为：" + var2);
    }

    public static void printString() {
        int num = 69;
        String str = num % 2 == 0 ? "偶数" : "奇数";
        System.out.println("num:" + num + "是" + str);
    }

    public static void add() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的和" + (x + y));
    }

    public static void sub() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的差" + (x + y));
    }

    public static void mul() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的积" + (x * y));
    }

    public static void div() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的商" + (x / y));
    }

    public static void remain() {
        int x = 100;
        int y = 200;
        System.out.println("x,y的余数" + (x % y));
    }


}
