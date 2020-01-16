package day18;


import java.io.*;
import java.util.HashMap;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Text1 {
    public static void main(String[] args) {
        //5.
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入文件目录：");
        String str=scan.nextLine();
        File file=new File(str);
        FileInputStream fis=null;
        FileOutputStream fos=null;
        byte[] b=new byte[2];
        int len;
        File[] files=file.listFiles();
        int count=0;
        for (File f:files) {
            if (f.isFile()){
                if (f.getName().endsWith(".java")) {
                    count++;
                    try {
                        fis = new FileInputStream(str + "\\" + f.getName());
                        fos = new FileOutputStream("d:\\java\\" + f.getName());
                        while (true) {
                            len = fis.read(b);
                            if (len == -1) {
                                break;
                            }

                            fos.write(b, 0, len);
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(count);

    }

    public static void text1() {
        //1.
        Scanner scan = new Scanner(System.in);
        try {
            FileOutputStream out = new FileOutputStream("d:\\fos.txt", true);
            while (true) {
                System.out.println("请输入学生信息（格式为：学号-学生姓名）：");
                String str = scan.nextLine();
                if ("end".equals(str)) {
                    break;
                } else {
                    out.write(str.getBytes());
                    out.write("\r\n".getBytes());
                }
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //2.
    public static void text2() {
        File f = new File("d:\\d1");
        File[] files = f.listFiles();
        try {
            FileOutputStream fr = null;
            FileInputStream fw = null;
            for (File file : files) {
                fw = new FileInputStream(f + "\\" + file.getName());
                fr = new FileOutputStream("d:\\d2\\" + file.getName());
                byte[] c = new byte[1024];
                int len;
                while (true) {
                    len = fw.read(c);
                    if (len == -1) {
                        break;
                    }
                    fr.write(c, 0, len);
                }

            }
            fr.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //3.
    public static void text3() {
        FileInputStream input = null;
        byte[] b = new byte[1];
        int len;
        HashMap<Character, Integer> map = new HashMap<>();
        try {
            input = new FileInputStream("d:\\fos.txt");
            while (true) {
                len = input.read(b);
                if (len == -1) {
                    break;
                }
                String str = new String(b, 0, len);
                for (int i = 0; i < str.length(); i++) {
                    char chars = str.charAt(i);
                    if (!map.containsKey(chars)) {
                        map.put(chars, 1);
                    } else {
                        Integer count = map.get(chars);
                        map.put(chars, ++count);
                    }
                }
            }
            input.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<Character> keys = map.keySet();
        keys.stream().forEach(n -> {
            System.out.println("key:" + n + ",value:" + map.get(n));
        });
    }

    //4.
    public static void text4(){
        Properties p = new Properties();
        FileWriter fw=null;
        try {
            FileReader fr =new FileReader("d:\\fos.txt");
            p.load(fr);
            fw=new FileWriter("d:\\fos.txt");

        Set<String> keys = p.stringPropertyNames();
        for (String str : keys) {
            if ("lisi".equals(str)) {
                p.setProperty(str, "100");
            }
                fw.write(str+"="+p.getProperty(str));
            fw.write("\r\n");

            System.out.println("key:" + str + ",value:" + p.getProperty(str));
        }
            fw.flush();
            fw.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
