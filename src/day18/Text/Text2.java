package day18.Text;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

public class Text2 {
    public static void main(String[] args) {

        text8();
    }

    public static void text8(){
        try {
            FileReader fr=new FileReader("d:\\fos.txt");
            Properties p = new Properties();
            User user=new User();
            p.load(fr);
            Set<String> keys=p.stringPropertyNames();
            for (String str:keys){
                if ("name".equals(str)){
                    user.setName(p.getProperty(str));
                }
                if ("age".equals(str)){
                    user.setAge(Integer.parseInt(p.getProperty(str)));
                }
                if ("sex".equals(str)){
                    user.setSex(p.getProperty(str));
                }

//                System.out.println("key:"+str+",value:"+p.getProperty(str));
            }

            System.out.println(user.toString());

            /*keys.stream().forEach(n->{
                System.out.println("key:"+n+",value:"+p.getProperty(n));
            });*/

            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void text7(){
        Properties p=new Properties();
        p.setProperty("name","张三");
        p.setProperty("age","18");
        p.setProperty("sex","男");

        Set<String> keys=p.stringPropertyNames();
        keys.stream().forEach(n->{
            System.out.println("key:"+n+",value:"+p.getProperty(n));
        });
    }

    public static void text6(){
        FileReader fr;
        FileWriter fw;
        String str="";
        File f=new File("d:\\fos.txt");
        Date date=new Date();
        SimpleDateFormat sp=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String str2=sp.format(date);
        Random rand=new Random();
        str="d:\\work\\"+str2+rand.nextInt(10)+f.getName();
        try {
            fr=new FileReader(f);
            fw=new FileWriter(str);
            char[] c=new char[2];
            int len;
            while (true){
                len=fr.read(c);
                if (len==-1){
                    break;
                }
                fw.write(c,0,len);
            }

            fw.flush();
            fw.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void text5(){
        FileInputStream fos;
        FileOutputStream fis;
        byte[] b=new byte[1024];
        int len;
        try {
            fos=new FileInputStream("D:\\workspace\\Java笔记\\java笔记.txt");
            fis=new FileOutputStream("D:\\work\\1.txt");
            /*fos=new FileInputStream("d:\\1.png");
            fis=new FileOutputStream("D:\\work\\2.png");*/

            while (true){
                if ((len=fos.read(b))==-1){
                    break;
                }
                fis.write(b,0,len);
            }

            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void text4(){
        try {
            FileInputStream input=new FileInputStream("d:\\fos.txt");
           /* System.out.println((char) input.read());
            System.out.println((char) input.read());*/
            // 定义字节数组，作为装字节数据的容器
            byte[] b=new byte[2];
            // 定义变量，作为有效个数
            int len;
            while (true){
                if ((len=input.read(b))==-1){
                    break;
                }
                System.out.println(new String(b,0,len));
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void text1(){
        try {
            FileOutputStream out=new FileOutputStream("d:\\fos.txt");
            out.write(97);
            out.write("\r\n".getBytes());
            out.write(98);
            out.write("\r\n".getBytes());
            out.write(99);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void text2(){
        try {
            FileOutputStream out=new FileOutputStream("d:\\fos.txt");
            byte[] b="abcdefg".getBytes();
            out.write(b);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void text3(){
        try {
            FileOutputStream out=new FileOutputStream("d:\\fos.txt");
            byte[] b="abc十九点接口".getBytes();
            out.write(b,3,b.length-3);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
