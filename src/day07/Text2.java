package day07;

import java.util.ArrayList;
import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {
        //第一题
        String st1=new String("你好");
        System.out.println("方式一创建字符串数组："+st1);

        char[] chs={'h','e','l','l','o'};
        String st2=new String(chs);
        System.out.println("方式二创建字符串数组："+st2);

        byte[] byt={'a','b','c','d','e'};
        String st3=new String(byt);
        System.out.println("方式三创建字符串数组："+st3);

        System.out.println();

        //第二题
        String str1 = "hello";
        String str2 = new String("hello");
        String str3 = "Hello";
        System.out.println("str1和str2内容是否相等：" + str1.equals(str2));
        System.out.println("str1和str3内容是否相等：" + str1.equals(str3));
        System.out.println("忽略大小写比较str1和str3内容是否相等：" + str1.equalsIgnoreCase(str3));
        System.out.println(str1.substring(0, 2) == "He" ? "str1字符串是否以He前缀开头：" + true : "str1字符串是否以He前缀开头：" + false);
        System.out.println(str1.substring(0, 3) == "abc" ? "str1字符串是否以abc前缀开头：" + true : "str1字符串是否以abc前缀开头：" + false);
        System.out.println(str1.charAt(str1.length() - 1) == 'o' ? "str1字符串是否以o后缀结尾：" + true : "str1字符串是否以o后缀结尾：" + false);
        System.out.println(str1.charAt(str1.length() - 1) == 'l' ? "str1字符串是否以l后缀结尾：" + true : "str1字符串是否以l后缀结尾：" + false);
        System.out.println();

        //第三题
        String str4 = "HelloWorld广州";
        System.out.println("str4字符串的长度:" + str4.length());
        System.out.println("str4字符串长度为2的char值：" + str4.charAt(2));
        System.out.println("字符串o第一次出现在str4字符串中的索引：" + str4.indexOf("o"));
        System.out.println("截取字符串str4从索引6开始到结束：" + str4.substring(6));
        System.out.println("截取字符串str4，从索引2开始到索引7：" + str4.substring(2, 7));
        System.out.println();

        //第四题
        String str5 = "HelloWorld";
        char[] ch = str5.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println("将str5字符串转换为小写：" + str5.toLowerCase());
        System.out.println("将str5字符串转换为大写：" + str5.toUpperCase());
        System.out.println("将str5字符串中的字符'o'替换成'6'：" + str5.replace('o', '6'));
        System.out.println("将str5字符串中的字符'll'替换成'LL'：" + str5.replace("ll", "LL"));
        System.out.println();

        //第五题
        System.out.println("8的绝对值：" + Math.abs(8));
        System.out.println("-9的绝对值：" + Math.abs(-9));
        System.out.println("6.1向上取整的值：" + Math.ceil(6.1));
        System.out.println("-6.1向上取整的值：" + Math.ceil(-6.1));
        System.out.println("6.0向下取整的值：" + Math.floor(6.0));
        System.out.println("-6.8向下取整的值：" + Math.floor(-6.8));
        System.out.println("5.88四舍五入的值：" + Math.round(5.88));
        System.out.println("-5.88四舍五入的值：" + Math.round(-5.88));
        System.out.println();

        //第六题
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str6 = scan.next();
        String str7 = "奥巴马";
        System.out.println(str6.replace(str7, "*"));
        System.out.println();

        //第七题
        Scanner scan2 = new Scanner(System.in);
        System.out.println("请输入一个QQ号码：");
        String qq = scan2.next();
        System.out.println("这个QQ号码是否正确：" + checkQQ(qq));
        System.out.println();

        //第八题
        String str8 = "javafiewjavajfiowfjavagkljjava";
        System.out.println("javafiewjavajfiowfjavagkljjava字符串中Java的数量：" + getCount(str8, "java"));
        System.out.println();

        //第九题
        ArrayList<String> list = new ArrayList<>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦你在干嘛呢");
        list.add("别跑啊");
        System.out.println("源ArrayList" + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 4) {
                list.remove(list.get(i));
                i = i - 1;
            }
        }
        System.out.println("删除后的ArrayList:" + list);
        System.out.println();
    }

    //第七题
    public static Boolean checkQQ(String qq) {
        Boolean flag = true;
        if (qq.length() >= 5 && qq.length() <= 12 && qq.indexOf("0") != 0) {
            char[] ch = qq.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= '0' && ch[i] <= '9') {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }

    //第八题
    public static int getCount(String str, String ch) {
        int count = 0;
        while (str.indexOf(ch) != -1) {
            int num = str.indexOf(ch);
            str = str.substring(num + ch.length());
            count++;
        }
        return count;
    }

}