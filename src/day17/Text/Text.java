package day17.Text;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Text {
    public static void main(String[] args) {
        /*File file=new File("D:\\workspace\\Java笔记\\java笔记.java");
        System.out.println("绝对路径:"+file.getAbsolutePath());
        System.out.println("将此File转换为路径名字符串:"+file.getPath());
        System.out.println("目录名称："+file.getName());
        System.out.println("文件长度："+file.length());*/

       /* File file1=new File("D:\\workspace\\Java笔记\\Java笔记.java");
        System.out.println("文件是否存在："+file1.exists());
        System.out.println("文件是否为目录："+file1.isDirectory());
        System.out.println("文件是否为文件："+file1.isFile());
        File f=new File("D:\\workspace\\Java笔记\\a.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件是否存在："+file1.exists());

        f.delete();
        System.out.println(f.delete());*/

      /*  File f=new File("D:\\workspace\\Java笔记\\a\\b\\c");
        //只能创建一级目录
//        f.mkdir();

        //可以一次创建多个目录
        f.mkdirs();

        File f=new File("D:\\workspace\\Java笔记");
        String[] str=f.list();
        for (String str1:str){
            System.out.println(str1);
        }

        File f2=new File("D:\\workspace");
        File[] str2=f2.listFiles();
        for (File str1:str2){
            System.out.println(str1);
        }


        System.out.println(sum(100));

        System.out.println(jieChen(5));

        File f=new File("D:\\File");
        File(f);*/

//      File dir=new File("d:\\aaa");
//      printDir(dir);

    }

    public static int sum(int a){
        if (a<=0){
            return 0;
        }
        return a+sum(--a);
    }

    public static int jieChen(int a){
        if (a<=0){
            return 1;
        }
        return a*jieChen(--a);
    }

    public static void File(File file){
        File[] file1=file.listFiles();
        for (File f:file1){
            if (f.isFile()){
                System.out.println(f.getName());
            }else {
                File(f);
            }
        }
    }

    public static void printDir(File dir){
        File[] files=dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
        });
        for (File file:files){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
            }else {
                printDir(file);
            }
        }
    }
}
