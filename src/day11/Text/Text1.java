package day11.Text;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Text1 {
    public static void main(String[] args) throws Exception {
        System.out.println(System.currentTimeMillis());

        System.out.println();
        int[] src = new int[]{1, 2, 3, 4, 5};
        int[] desc = new int[]{6, 7, 8, 9, 10};
        System.arraycopy(src, 1, desc, 0, 2);
        System.out.println(Arrays.toString(desc));
        /*for (int i = 0; i < desc.length; i++) {
            System.out.print(desc[i]);
        }*/

        System.out.println();
        System.out.println();

        String str = new String();
        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long end3 = System.currentTimeMillis();
        System.out.println(end3 - start3);

        StringBuilder strb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            strb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuffer strbf = new StringBuffer();
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            strbf.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

        System.out.println();

        //时间戳
        Date dt = new Date();
        System.out.println(dt.getTime());
        System.out.println(dt);

        //把日期格式转换成日期字符串
        SimpleDateFormat fort = new SimpleDateFormat("yyyy‐MM‐dd HH:mm:ss");
        String form = fort.format(dt);
        System.out.println(form);

        //把日期字符串转换成日期格式
        String date = "2020年11月1日";
        SimpleDateFormat sform = new SimpleDateFormat("yyyy年MM月dd日");
        Date date2 = sform.parse(date);
        System.out.println(date2);

        System.out.println();

        //Calendar
        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR,2024);
//        int year=calendar.get(Calendar.YEAR);
//        System.out.println("当前年："+year);
        System.out.println("当前年：" + calendar.get(Calendar.YEAR));
        System.out.println("当前月:" + calendar.get(Calendar.MONTH) + 1);
        System.out.println("当前月中的第几天：" + calendar.get(Calendar.DATE));
        System.out.println("周中的几天：" + (calendar.get(Calendar.DAY_OF_WEEK)-1));

        calendar.add(Calendar.YEAR, -2);
        System.out.println("当前年：" + calendar.get(Calendar.YEAR));

        Date date3 = calendar.getTime();
        System.out.println(date3);

        System.out.println();

        //==  equals
        //==是比较对象（内存地址）
        //equals是比较对象（内存地址）
        //重写以后
        //equals是比较对象的值

        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        //默认重写了equals方法
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));

        System.out.println("================================");


        //重写equals方法就必须要重写hashCode方法
        //值相同，他们的hashCode一定相同
        //hashCode相同，值不一定相同（aa和bB）


        Person p1 = new Person("abc", 20);
        Person p2 = new Person("abc", 20);
        System.out.println(p1 == p2);
        //如果Person重写equals方法，结果为true，不重写结果为false
        System.out.println(p1.equals(p2));

        System.out.println("=============================");

        //StringBuilder没有重写equals方法
        StringBuilder sb = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb == sb2);
        System.out.println(sb.equals(sb2));


        System.out.println();

        System.out.println("Ma".hashCode());
        System.out.println("NB".hashCode());


    }
}
