package day06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1=scan.nextInt();
        System.out.println("请输入第二个数");
        int num2=scan.nextInt();
        System.out.println("请输入第三个数");
        int num3=scan.nextInt();
        int max=num1>num2?num1:num2;
        max=max>num3?max:num3;
//        int max=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
        System.out.println("最大值为"+max);*/

        //随机数
      /*  Random r2=new Random();
        int num=r2.nextInt(2);
        System.out.println(num);*/
       /* int n = 50;
        //创建对象
        Random r = new Random();
        //获取随机数
        int number = r.nextInt(n) + 1;
        //输出随机数
        System.out.println("number: " + number);*/

        /*ArrayList<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("张三");
        list.add("二麻子");
        printList(list);*/


        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        double a=r.nextDouble();
        Boolean b=r.nextBoolean();
        float c=r.nextFloat();
        long d=r.nextLong();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        /*int a = r.nextInt(10) + 1;
        while (true) {
            int b = scan.nextInt();
            if (b > a) {
                System.out.println("猜大了");
            } else if (b < a) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了");
                System.out.println("随机数为"+a);
                break;
            }
        }*/




    }

    public static void printList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print("}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
