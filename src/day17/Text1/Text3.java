package day17.Text1;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Text3 {
    public static void main(String[] args) {
        //1.使用文件过滤器筛选将指定文件夹下的小于200K的小文件获取并打印(包括所有子文件夹的文件)
        File file1=new File("D:\\workspace\\java\\src\\day15");
        filtrate(file1);

        System.out.println();

        //2.键盘录入一个文件夹路径，删除该路径下的文件夹。
        //要求：文件夹中包含有子文件夹
        File file2=new File("D:\\新建文件夹 (3)");
        delete(file2);

        System.out.println();

        //3.键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
        //注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
        //用个数作为value,放入到map集合中,并用两种方式遍历map集合
        //例如：
        //doc 的类型的文件有 3 个
        //java 的类型的文件有 5 个
        //txt 的类型的文件有 7 个
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件路径：");
        String str = scan.nextLine();
        File file3 = new File(str);
        HashMap<String,Integer> map=new HashMap<>();
        doc(file3,map);
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "的类型的文件有" + map.get(key) + "个");
        }

        System.out.println();

        //4.从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
        System.out.println("请输入文件路径：");
        String str2 = scan.nextLine();
        File file4 = new File(str2);
        wj(file4);


    }

    //1.
    public static void filtrate(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.length() / 1024 < 200 || pathname.isDirectory();
            }
        });

        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f);
            } else {
                filtrate(f);
            }
        }
    }

    //2.
    public static void delete(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                f.delete();
            } else {
                delete(f);
            }
        }
        file.delete();

    }

    //3.
    public static void doc(File file, HashMap<String, Integer> map) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                doc(f, map);
            } else {
                int num = f.getName().indexOf(".");
                String str = f.getName().substring(num + 1);
                if (map.containsKey(str)) {
                    map.put(str, map.get(str)+1);
                }else {
                    map.put(str,1);
                }
            }
        }
        /*int jnum = 0;
        int dnum = 0;
        int tnum = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    jnum += 1;
                    map.put("java", jnum);
                }
                if (f.getName().endsWith(".doc")) {
                    dnum += 1;
                    map.put("doc", dnum);
                }
                if (f.getName().endsWith(".txt")) {
                    tnum += 1;
                    map.put("txt", tnum);
                }
            } else {
                doc(f);
            }
        }*/


    }

    //4.
    public static void wj(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println(f.getName());
                wj(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }


}
