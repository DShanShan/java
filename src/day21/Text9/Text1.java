package day21.Text9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Text1 {
    public static void main(String[] args) throws Exception {
        File file = new File("/stu2.properties");
        if (!file.exists()) {
            file.createNewFile();
        }

        Properties p = new Properties();
        p.load(new FileInputStream(file));
        if (p.getProperty("count") == null) {
            p.setProperty("count", "0");
            if (Integer.parseInt(p.getProperty("count")) >= 3) {
                System.out.println("程序使用次数已满,请续费");
                return;
            } else {
                int num=Integer.parseInt(p.getProperty("count"))+1;
                p.setProperty("count", String.valueOf(num));
                System.out.println("运行次数为" + p.getProperty("count"));
            }

        }else {
            int num=Integer.parseInt(p.getProperty("count"))+1;
            p.setProperty("count", String.valueOf(num));
            System.out.println("运行次数为" + p.getProperty("count"));
        }
            FileOutputStream fos=new FileOutputStream(file);
            p.store(fos,"");
            fos.close();

    }
}
