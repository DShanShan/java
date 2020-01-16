package day19.Text1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) throws Exception {

//        text2();
//        text3();
//        text4();
//        text5();
//        text6();
//        text7();
//        text8();
//        text9();
//        text10();
//        text11();
//        text12();


    }

    //2.
    public static void text2() throws Exception{
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("d:\\a.txt"));
        byte[] b=new byte[2];
        int len;
        while (true){
            len=bis.read(b);
            if (len==-1){
                break;
            }
            System.out.print(new String(b,0,len));
        }

        System.out.println();

        bis.close();
    }

    //3.
    public static void text3() throws Exception{
        File file=new File("d:\\c.png");
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\d2\\a.png"));
        byte[] b=new byte[1024];
        int len;
        while (true){
            len=bis.read(b);
            if (len==-1){
                break;
            }
            bos.write(b,0,len);
        }
        bos.close();
        bis.close();
    }

    //4.
    public static void text4() throws Exception {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bos = new BufferedWriter(new FileWriter("data.txt"));
        int i = 1;
        while (i <= 3) {
            System.out.println("请输入三个字符串验证码：");
            String str = scan.nextLine();
            bos.write(str);
            bos.newLine();
            i++;
        }
        bos.close();
        BufferedReader bis = new BufferedReader(new FileReader("data.txt"));
        System.out.println("请输入你的验证码：");
        String str2 = scan.nextLine();
        String len = null;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            len = bis.readLine();
            if (len == null) {
                break;
            }
            list.add(len);
        }
        Boolean flag = true;
        for (String str : list) {
            if (str2.equals(str)) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }
        bis.close();
    }

    //5.
    public static void text5() throws Exception {
        OutputStreamWriter isr = new OutputStreamWriter(new FileOutputStream("a1.txt"), "gbk");
        isr.write("我爱java");
        isr.close();
    }

    //6.
    public static void text6() throws Exception {
        FileInputStream fis = new FileInputStream("d:\\fos.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        int len;
        char[] b = new char[1];
        while (true) {
            len = isr.read(b);
            if (len == -1) {
                break;
            }
            System.out.println(new String(b, 0, len));
        }
        isr.close();
        fis.close();
    }

    //7.
    public static void text7() throws Exception {
        Student s1 = new Student("张三", 18, "男");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        oos.writeObject(s1);
        oos.close();
    }

    //8.
    public static void text8() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stu.txt"));
        Student s = (Student) ois.readObject();
        ois.close();

        System.out.println(s);
    }

    //9.
    public static void text9() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一串字符串：");
        String str = scan.nextLine();
        PrintStream ps = new PrintStream("d.txt");
        ps.println(str);
    }

    //10
    public static void text10() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        FileReader fr = new FileReader("text.txt");
        FileWriter fw = new FileWriter("text1.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            list.add(line);
        }
        Collections.reverse(list);

        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
        br.close();
        fw.close();
        fr.close();
    }

    public static void text11() throws Exception {
        Student s1 = new Student("张三", 19, "男");
        Student s2 = new Student("李四", 20, "男");
        Student s3 = new Student("王五", 21, "男");
        ArrayList<Student> list = new ArrayList<>();
//        ArrayList<Student> list1=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stus.txt"));
        oos.writeObject(list);
        oos.close();
        /*ObjectInputStream ois=new ObjectInputStream(new FileInputStream("stus.txt"));
        list1=(ArrayList<Student>) ois.readObject();
        ois.close();*/

    }

    //12.
    public static void text12() throws Exception {
        FileReader fr = new FileReader("a.txt");
        FileWriter fw = new FileWriter("b.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String line;
        while (true) {
            line = br.readLine();
            if (line == null) {
                break;
            }
            bw.write(line);
            bw.newLine();
            System.out.println(line);
        }

        bw.close();
        br.close();
        fw.close();
        fr.close();
    }
}
