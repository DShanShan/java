package day17.Text1;

import java.io.File;
import java.io.IOException;

public class Text1 {
    public static void main(String[] args) {

       /* //1.创建两个文件对象，分别使用相对路径和绝对路径创建。
        File file1=new File("D:\\File\\aaa.txt");

        String path="D:\\File";
        String child="aaa.txt";
        File file2=new File(path,child);

        //2.检查C盘下是否存在文件a.txt,如果不存在则创建该文件。
        File file3=new File("d:\\a.txt");
        System.out.println("是否存在："+file3.exists());
        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("是否存在："+file3.exists());

        //3.在C盘下创建一个名为bbb的文件夹
        File file4=new File("d:\\ddd");
        System.out.println(file4.mkdirs());

       //4.在C盘下创建一个名为ccc的文件夹，要求如下：
       //1.ccc文件夹中要求包含bbb子文件夹
       //2.bbb子文件夹要求包含aaa文件夹
        File file5=new File("d:\\ccc\\bbb\\aaa");
        System.out.println(file5.mkdirs());

        //5.将C盘下a.txt文件删除
        //将C盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹
        File file6=new File("d:\\a.txt");
        System.out.println(file6.delete());

        File file7=new File("d:\\ccc\\bbb\\aaa");
        System.out.println(file7.delete());*/

        //6.获取C盘aaa文件夹中b.txt文件的文件名，文件大小，文件的绝对路径和父路径等信息，并将信息输出在控制台
        File file8 = new File("d:\\File\\aaa.txt");
        System.out.println("文件名：" + file8.getName());
        System.out.println("文件大小：" + file8.length());
        System.out.println("文件的绝对路径：" + file8.getAbsolutePath());
        System.out.println("文件的父路径：" + file8.getParent());

        //7.判断File对象是否文件,是文件则输出：xxx是一个文件，否则输出：xxx是不是一个文件。 2.判断File对象是否文
        //件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx是不是一个文件夹。(xxx是文件名或文件夹名)
        File file9 = new File("d:\\File\\aaa.txt");
        if (file9.isDirectory()) {
            System.out.println("aaa是一个文件夹");
        } else {
            System.out.println("aaa是一个文件");
        }

        //8.获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
        //注意：不包含子文件夹下的文件
        File file10 = new File("d:\\File");
        String[] str = file10.list();
        for (String str1 : str) {
            System.out.println(str1);
        }

        //9.求1到n的和(n>=100 &&n<=200)
        System.out.println(sum(100));

        //10.求整数n的阶乘(n <=10)
        System.out.println(factorial(10));

    }

    //9.
    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(--n);
    }

    //10.
    public static int factorial(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * factorial(--n);
    }
}
