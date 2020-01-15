package day05;

public class Text {
    public static void main(String[] args) {

        //第二题
        Dog dog = new Dog("旺财", 2);
        dog.showMsg();
        System.out.println();

        //第三题
        Teacher t = new Teacher();
        t.setName("周老师");
        t.setAge(30);
        t.setContent("正在亢奋的讲着");
        t.eat();
        t.teach();
        Student stu = new Student("韩同学", 18, "正在专心致志的听着");
        stu.eat();
        stu.study();
        System.out.println();

        //第四题
        Card card = new Card("黑桃", "A");
        card.showCard();
        System.out.println();

        //第五题
        Circle c = new Circle(8);
        c.showArea();
        c.showPerimeter();
        System.out.println();

        //第六题
        Manager m=new Manager("James","9527",15000,3000);
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("==============");
        Coder cd=new Coder("Kobe","0025",10000);
        cd.intro();
        cd.showSalary();
        cd.work();
        System.out.println();

        //第七题
        MyDate mDay=new MyDate(1900,1,1);
        mDay.showDate();
        mDay.isBi();
        System.out.println();

        //第八题
        Book b1=new Book("No0001","java","isbn23446885432",55.4,"2017-04-03");
        Book b2=new Book("No0002","C","isbn2940092894949",58.4,"2017-07-13");
        Book b3=new Book("No0003","javaWeb实战","isbn344203445",60.4,"2017-01-01");

        Book[] b=new Book[3];
        b[0]=b1;
        b[1]=b2;
        b[2]=b3;

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (b[i].getPrice()>=b[j].getPrice()){
                    Book temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i].getPrice());
        }
        System.out.println(b[0].getPrice());

        /*if (b1.getPrice()>b2.getPrice()){
            if (b1.getPrice()>b3.getPrice()){
                b1.showBook();
            }else {
                b3.showBook();
            }
        }else {
            if (b2.getPrice()>b3.getPrice()){
                b2.showBook();
            }else {
                b3.showBook();
            }
        }*/
        System.out.println();



    }
}

