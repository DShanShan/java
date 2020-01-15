package day11.Text3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) throws Exception {

        //1.获取当前日期并把这个日期转换成指定格式的字符串，如2088-08-08 08:08:08
        Date dt=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String form=sdf.format(dt);
        System.out.println("转换成字符串格式为：");
        System.out.println(form);

        System.out.println();

        //2.把你的生日字符串转换成对应的日期对象
        String str="1992-10-20";
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
        Date dt2=sdf2.parse(str);
        System.out.println("把生日字符串转换成对应的日期对象：");
        System.out.println(dt2);

        System.out.println();

        //3.计算500天后是几几年几月几日
        Calendar cld=Calendar.getInstance();
        cld.add(Calendar.DATE,500);
        int year=cld.get(Calendar.YEAR);
        int month=cld.get(cld.get(Calendar.MONTH));
        int date=cld.get(Calendar.DATE);
        System.out.println("500天后是几几年几月几日:");
        System.out.println(year+"年"+month+"月"+date+"日");

        System.out.println();

        //4.计算你活了多少天
        String str2="2000-05-28";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
        Date dt3=sdf3.parse(str2);
        long mill=dt3.getTime();
        Date dt4=new Date();
        long millDate=dt4.getTime();
        long huoMill=millDate-mill;
        System.out.println(huoMill/1000/60/60/24+"天");

        System.out.println();

        //5.查看String跟StringBuilder循环消耗的时间
        String str3=new String();
        long star1=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str3+=i;
        }
        long end1=System.currentTimeMillis();
        System.out.println("String对象for循环花费的时间：");
        System.out.println(end1-star1);

        StringBuilder strb=new StringBuilder();
        long star2=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strb.append(i);
        }
        long end2=System.currentTimeMillis();
        System.out.println("StringBuilder对象for循环花费的时间：");
        System.out.println(end2-star2);

        System.out.println();

        //6.使用SimpleDateFormat类把2016-12-18转换为2016年12月18日
        SimpleDateFormat sdf4=new SimpleDateFormat("yyyy-MM-dd");
        Date dt5=sdf4.parse("2016-12-18");
        SimpleDateFormat sdf5=new SimpleDateFormat("yyyy年MM月dd日");
        String now=sdf5.format(dt5);
        System.out.println("把2016-12-18转换为2016年12月18日:");
        System.out.println(now);

        System.out.println();

        //7.购物小票案例
        System.out.println("\t\t欢迎使用超市购物系统");


        while(true){
            System.out.println("请输入你要进行的操作：");
            System.out.println("1:购买商品\t\t2:结算并打印小票\t\t3:退出系统");
            Scanner scan=new Scanner(System.in);
            int optNumber = scan.nextInt();
            switch(optNumber){

                case 1:
                    enterNumber();
                    break;
                case 2:
                    printReceipt();
                    break;
                case 3:
                    System.out.println("感谢您使用超市购物系统,欢迎下次光临,拜拜");
                    System.exit(0);
                default:
                    System.out.println("请输入正确的数字!");
                    break;
            }
        }


    }

    public static void enterNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("\t\t商品列表");
        Shop shop1=new Shop("001","少林核桃",15.5d,"斤",0);
        Shop shop2=new Shop("002","尚康饼干",14.5d,"包",0);
        Shop shop3=new Shop("003","移动硬盘",345.0d,"个",0);
        Shop shop4=new Shop("004","高清无码",199.0d,"G",0);
        System.out.println("商品id\t名称\t\t单价\t\t计价单位");
        System.out.println(shop1.getId()+"\t\t"+shop1.getName()+"\t"+shop1.getPrice()+"\t\t"+shop1.getUnit());
        System.out.println(shop2.getId()+"\t\t"+shop2.getName()+"\t"+shop2.getPrice()+"\t\t"+shop2.getUnit());
        System.out.println(shop3.getId()+"\t\t"+shop3.getName()+"\t"+shop3.getPrice()+"\t\t"+shop3.getUnit());
        System.out.println(shop4.getId()+"\t\t"+shop4.getName()+"\t"+shop4.getPrice()+"\t\t"+shop4.getUnit());

        System.out.println("--------------------------------------------");
        System.out.println("请输入您要购买的商品项（输入格式：商品id-购买数量）,输入end表示购买结束");
        Boolean flag=true;
        ArrayList<String> list =new ArrayList<>();
        while (flag){
            String num2=scan.next();
            Boolean flag2=num2.indexOf(shop1.getId()+"-")!=-1||num2.indexOf(shop2.getId()+"-")!=-1||num2.indexOf(shop3.getId()+"-")!=-1||num2.indexOf(shop4.getId()+"-")!=-1;
            if (flag2){
                list.add(num2);
                continue;
            }else if("end".equals(num2)){
                System.out.println("购买结束");
                flag=false;
            } else if (num2.indexOf(shop1.getId())==-1 && num2.indexOf(shop2.getId())==-1 && num2.indexOf(shop3.getId())==-1 && num2.indexOf(shop4.getId())==-1){
                System.out.println("您输入的商品id不存在,请重新输入!!");
                continue;
            }else {
                System.out.println("你输入的购买姿势不对,请换个姿势再来一次(输入格式：商品id-购买数量)");
            }
        }
    }

    public static void printReceipt(){
        System.out.println("-------------------------------");
        System.out.println("\t\t欢迎光临");
        System.out.println("名称\t售价\t数量\t金额");
        System.out.println("-------------------------------");


    }
}
