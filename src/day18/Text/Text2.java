package day18.Text;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Text2 {
    public static void main(String[] args) {

        text5();
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
