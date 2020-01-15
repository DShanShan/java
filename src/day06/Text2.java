package day06;

import java.util.ArrayList;

public class Text2 {
    public static void main(String[] args) {
        ArrayList<Work> work2 = new ArrayList<>();
        work2.add(new Work("bz001", "黄渤", 45));
        work2.add(new Work("bz002", "孙红雷", 48));
        work2.add(new Work("bz003", "罗志祥", 35));
        work2.add(new Work("bz004", "张三", 50));
        work2.add(new Work("bz005", "李四", 25));
        work2.add(new Work("bz006", "王五", 60));
        work2.add(new Work("bz007", "二麻子", 30));

        //取出工资前三名，放入另外一个集合中遍历出来
        for (int i = 0; i < work2.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (work2.get(i).getAge()>work2.get(j).getAge()){
                    Work w2=work2.get(i);
                    work2.set(i,work2.get(j));
                    work2.set(j,w2);
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("id:"+work2.get(i).getId()+",name:"+work2.get(i).getName()+",age:"+work2.get(i).getAge());
        }



        System.out.println("==================");

        for (int i = 0; i < work2.size(); i++) {
            int max=i;

            for (int j = i+1; j < work2.size(); j++) {
                if (work2.get(j).getAge()>work2.get(max).getAge()){
                    max=j;
                }
            }

            Work temp=work2.get(i);
            work2.set(i,work2.get(max));
            work2.set(max,temp);
        }
        for (int i = 0; i < work2.size(); i++) {
            System.out.println("id:"+work2.get(i).getId()+",name:"+work2.get(i).getName()+",age:"+work2.get(i).getAge());
        }



        System.out.println("==================");

        ArrayList<Work> work3=new ArrayList<>();
        work3.add(new Work("bz001", "张三", 20));
        work3.add(new Work("bz002", "李四", 30));
        work3.add(new Work("bz003", "王五", 25));

        ArrayList<ArrayList<Work>> wks=new ArrayList<>();
        wks.add(work2);
        wks.add(work3);

        for (int i = 0; i < wks.size(); i++) {
            ArrayList<Work> wor=wks.get(i);
            for (int j = 0; j < wor.size(); j++) {
                System.out.println("id:"+wor.get(j).getId()+",name:"+wor.get(j).getName()+",age:"+wor.get(j).getAge());
            }
        }















        /*work2.add(w1);
        work2.add(w2);
        work2.add(w3);


        for (int i = 0; i < work2.size(); i++) {
            for (int j = 0; j < i; j++) {
                Work wk=work2.get(i);

            }
        }*/

    }
}
