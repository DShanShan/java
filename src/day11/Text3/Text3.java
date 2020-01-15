package day11.Text3;

import java.util.ArrayList;
import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        //7.购物小票案例
        System.out.println("\t\t欢迎使用超市购物系统");
        System.out.println("请输入你要进行的操作：");
        System.out.println("1:购买商品\t\t2:结算并打印小票\t\t3:退出系统");
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        System.out.println("-------------------------------------------");
        System.out.println("\t\t商品列表");
        Shop shop1=new Shop("001","少林核桃",15.5d,"斤",0);
        Shop shop2=new Shop("002","尚康饼干",14.5d,"包",0);
        Shop shop3=new Shop("003","移动硬盘",345.0d,"个",0);
        Shop shop4=new Shop("004","高清无码",199.0d,"G",0);
        System.out.println("商品id\t名称\t\t单价\t\t计价单位");
        ArrayList<Shop> list=new ArrayList<>();
        list.add(shop1);
        list.add(shop2);
        list.add(shop3);
        list.add(shop4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId()+"\t\t"+list.get(i).getName()+"\t"+list.get(i).getPrice()+"\t\t"+list.get(i).getUnit());

        }
        System.out.println("--------------------------------------------");
        System.out.println("请输入您要购买的商品项（输入格式：商品id-购买数量）,输入end表示购买结束");
        Boolean flag=true;
        while (flag){
            String num2=scan.next();
            int num3=scan.nextInt();
            String num5=scan.next();
            String num4=num2+"-"+num3;

                if (num4.indexOf(shop1.getId()+"-")!=-1){
                    continue;
                }else if("end".equals(num5)){
                    System.out.println("购买结束");
                    flag=false;
                }else if(num4.indexOf(shop1.getId())==-1){
                    System.out.println("您输入的商品id不存在,请重新输入!!");
                    continue;
                }else {
                    System.out.println("你输入的购买姿势不对,请换个姿势再来一次(输入格式：商品id-购买数量)");
                }


        }

    }
}
