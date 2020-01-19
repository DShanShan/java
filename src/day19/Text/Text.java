package day19.Text;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Text {
    public static void main(String[] args) throws Exception {


//        text1();
//        text2();
//        text3();
//        text4();
//        text5();
//        text6();
//        text7();
//        text8();
//        text9();


    }

    public static void text9() throws Exception{
        System.out.println("hello");
        PrintStream ps=new PrintStream("d:\\d.txt");
        ps.println("world" );
    }

    public static void text8() throws Exception{
        //序列化集合
        User u1=new User("张三",18);
        User u2=new User("李四",20);
        ArrayList<User> list=new ArrayList<>();
        ArrayList<User> list2=new ArrayList<>();
        list.add(u1);
        list.add(u2);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\c.txt"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\c.txt"));
        list2=(ArrayList<User>) ois.readObject();

        list2.stream().forEach(n->{
            System.out.println(n);
        });
    }

    public static void text7() throws Exception{
        //序列化
        User user=new User("张三",18);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d:\\c.txt"));
        oos.writeObject(user);
        oos.close();

        //反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d:\\c.txt"));
        User u=(User) ois.readObject();
        System.out.println(u);
    }

    public static void text6() throws Exception{
        // 创建map集合,保存文本数据,键为序号,值为文字
        HashMap<String, String> lineMap = new HashMap<>();
// 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("d:\\fos.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\fos2.txt"));
// 读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
// 解析文本
            String[] split = line.split("\\.");
// 保存到集合
            lineMap.put(split[0], split[1]);
        }
// 释放资源
        br.close();
// 遍历map集合
        for (int i = 1; i <= lineMap.size(); i++) {
            String key = String.valueOf(i);
// 获取map中文本

            String value = lineMap.get(key);
// 写出拼接文本
            bw.write(key + "." + value);
// 写出换行
            bw.newLine();
        }
// 释放资源
        bw.close();

    }

    public static void text5() throws Exception {
        FileWriter fos = new FileWriter("d:\\fos.txt");
        BufferedWriter br = new BufferedWriter(fos);
        br.write("aa十大高手");
        br.newLine();
        br.write("扇士大夫");
        br.newLine();
        br.write("sdffx");
        br.newLine();
        br.write("dgg");

        br.close();
    }

    public static void text4() throws Exception {
        FileOutputStream fos = new FileOutputStream("d:\\fos.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
//        OutputStreamWriter osw2=new OutputStreamWriter(fos,"GBK");
        osw.write("卡里的的");
        osw.close();
    }

    public static void text3() throws Exception {
        FileInputStream fis = new FileInputStream("d:\\fos.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        InputStreamReader isr2 = new InputStreamReader(fis, "GBK");
        char[] b = new char[1];
        int len;
        while (true) {
//            len=isr.read(b);
            len = isr2.read(b);
            if (len == -1) {
                break;
            }
            System.out.println(new String(b, 0, len));

        }
        isr.close();
        fis.close();
    }

    public static void text1() throws Exception {
        long a = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\新建文件夹 (2)\\2第二阶段 JavaWeb网站设计（33天）\\WEB17_jsp\\WEB17_jsp\\WEB17_jsp\\视频\\04-jsp的九大隐式对象_.flv");
        FileOutputStream fos = new FileOutputStream("D:\\新建文件夹 (2)\\2第二阶段 JavaWeb网站设计（33天）\\04-jsp的九大隐式对象_.flv");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] b = new byte[1024];
        int len;
        while (true) {
            len = bis.read(b);
            if (len == -1) {
                break;
            }
            bos.write(b, 0, len);
        }
        long c = System.currentTimeMillis();
        System.out.println(c - a);

        bos.close();
        fos.close();
        bis.close();
        fis.close();
    }

    public static void text2() throws Exception {
        long a = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\新建文件夹 (2)\\2第二阶段 JavaWeb网站设计（33天）\\WEB17_jsp\\WEB17_jsp\\WEB17_jsp\\视频\\04-jsp的九大隐式对象_.flv");
        FileOutputStream fos = new FileOutputStream("D:\\新建文件夹 (2)\\2第二阶段 JavaWeb网站设计（33天）\\04-jsp的九大隐式对象_.flv");
        byte[] b = new byte[1024];
        int len;
        while (true) {
            len = fis.read(b);
            if (len == -1) {
                break;
            }
            fos.write(b, 0, len);
        }
        long c = System.currentTimeMillis();
        System.out.println(c - a);

        fos.close();
        fis.close();
    }
}
