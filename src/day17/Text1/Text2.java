package day17.Text1;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        //1.键盘录入一个文件路径，根据文件路径创建File对象
        //如果输入的文件路径对应的文件不存在，则创建该文件。
        //如果输入的文件路径对应的文件已经存在了，则获得文件大小并输出。
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件路径：");
        String str = scan.next();
        File file1 = new File(str);
        if (file1.exists()) {
            System.out.println("文件大小为：" + file1.length());
        } else {
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println();

        //2.键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
        //如果是文件，则输出文件的大小
        //如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入文件路径：");
        String str2 = scan2.nextLine();
        File file2 = new File(str2);
        if (file2.isFile()) {
            System.out.println("文件大小为" + file2.length());
        } else if (file2.isDirectory()) {
            File[] f = file2.listFiles();
            int sum = 0;
            for (File file : f) {
                sum += file.length();
            }
            System.out.println("文件大小为" + sum);
        }

        System.out.println();

        //3.递归遍历将指定文件夹的所有文件(包括所有子文件夹的文件)的全路径输出在控制台。
        File file3=new File("d:\\File");
        Files(file3);

        System.out.println();

        //4.获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
        File file4 = new File("d:\\File");
        fileJava(file4);

        System.out.println();

        //5.键盘录入一个文件夹路径，删除该路径下的文件夹。
        //要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
        //提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
        Scanner scan3=new Scanner(System.in);
        System.out.println("请输入文件路径：");
        String str3=scan3.nextLine();
        File file5=new File(str3);
        delete(file5);

        System.out.println();

        //6.从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
        Scanner scan4 = new Scanner(System.in);
        System.out.println("请输入文件路径：");
        String str4 = scan4.nextLine();
        File file6 = new File(str4);
        System.out.println(calculate(file6));


    }

    //3.
    public static void Files(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                System.out.println(file1.getAbsolutePath());
            } else {
                Files(file1);
            }
        }
    }

    //4.
    public static void fileJava(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                if (file1.getName().endsWith(".java")) {
                    System.out.println(file1.getName());
                }
            }
        }
    }

    //5.
    public static void delete(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            f.delete();
            if (f.isDirectory()) {
                delete(f);
            }
        }
        file.delete();
    }

    //6.
    public static long calculate(File file) {
        File[] files = file.listFiles();
        long size = 0;
        for (File f : files) {
            if (f.isDirectory()) {
                size+=calculate(f);
            } else {
                size += f.length();
            }
        }
       return size;
    }

}
