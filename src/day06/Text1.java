package day06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {

        //第二题
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = scan.nextInt();
        System.out.println("请输入第二个数据：");
        int b = scan.nextInt();
        System.out.println("请输入第三个数据：");
        int c = scan.nextInt();
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("三个数的最大值：" + max);
        System.out.println();

        //第三题
        Random rand = new Random();
        System.out.println("随机产生的五个随机数为：");
        for (int i = 0; i < 5; i++) {
            int number = rand.nextInt(10) + 1;
            System.out.println(number);
        }
        System.out.println();

        //第四题
        ArrayList<String> list = new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        String str = list.get(3);
        System.out.println("获取索引为3的元素：" + str);
        list.set(3, "唐僧");
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        //第五题
        ArrayList<Student> stu = new ArrayList<>();
        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        System.out.println("集合大小：" + stu.size());
        for (int i = 0; i < stu.size(); i++) {
            Student std =stu.get(i);
            System.out.println(std.getId() + "," + std.getName() + "," + std.getHeioght());
        }
        System.out.println("------------------");
        System.out.println("身高1.70以上的学员：");
        for (int i = 0; i < stu.size(); i++) {
            Student std =stu.get(i);
            if (std.getHeioght() > 1.70) {
                System.out.println(std.getId() + "," + std.getName() + "," + std.getHeioght());
            }
        }
        System.out.println();

        //第六题
        ArrayList<Teacher> teach = new ArrayList<>();
        Teacher t1 = new Teacher("姚小明", 23, "打篮球");
        Teacher t2 = new Teacher("景甜", 20, "打羽毛球");
        Teacher t3 = new Teacher("薛之谦", 45, "踢足球");
        teach.add(t1);
        teach.add(t2);
        teach.add(t3);


        for (int i = 0; i < teach.size(); i++) {
            Teacher tch=teach.get(i);
            System.out.println(tch.getName() + "," + tch.getAge() + "," + tch.getLike());
        }
        System.out.println("-----------------------");

        for (int i = 0; i < teach.size(); i++) {
            if (teach.get(i).getAge() > 40) {
                teach.get(i).setLike("打高尔夫");
                teach.get(i).show();
            }
        }
        System.out.println();

        //第七题
        ArrayList<Work> work = new ArrayList<>();
        Work w1 = new Work("bz001", "黄渤", 45);
        Work w2 = new Work("bz002", "孙红雷", 48);
        Work w3 = new Work("bz003", "罗志祥", 35);
        work.add(w1);
        work.add(w2);
        work.add(w3);
        findMaxAge(work);
        System.out.println();

        //第八题
        ArrayList<Book> book = new ArrayList<>();
        Scanner sca = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            Book bk = new Book();
            System.out.println("请录入第" + i + "本书的名称");
            String name = sca.next();
            bk.setTitle(name);
            System.out.println("请录入第" + i + "本书的价格");
            double price = sca.nextDouble();
            bk.setPrice(price);
            book.add(bk);
        }
        for (int i = 0; i < book.size(); i++) {
            for (int j = 0; j <= i; j++) {
                if (book.get(i).getPrice()>=book.get(j).getPrice()){
                    Book t=book.get(i);
                    book.set(i,book.get(j));
                    book.set(j,t);
                }
            }
        }

        for (int i = 0; i < book.size(); i++) {
            Book bk=book.get(i);
            System.out.println(bk.getTitle() +  "," + bk.getPrice());
        }




    }

    public static void findMaxAge(ArrayList<Work> works) {
        int maxAgeWork = works.get(0).getAge();
        for (int i = 1; i < works.size(); i++) {
            if (works.get(i).getAge() > maxAgeWork) {
                maxAgeWork = works.get(i).getAge();
                System.out.println("最高年龄work对象：");
                works.get(i).show();
            }
        }
    }
}
