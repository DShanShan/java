package day10.Text6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Text {

    public static void main(String[] args) {
        /*student(name, age，score)
        List<Student> list = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        班级a有若干学生
        班级b有若干学生
        1打印总共有多少姓张的学生的个数
        2.先按年龄降序，再按成绩升序排序
        3.打印2个班级中前3个姓张且年龄小于18岁的学生信息*/

        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 18, 80d));
        list.add(new Student("李三", 20, 30d));
        list.add(new Student("王三", 15, 90d));
        list.add(new Student("张五", 14, 60d));
        list.add(new Student("张二", 17, 75d));
        list.add(new Student("张六", 17, 100d));
        list.add(new Student("张十一", 12, 100d));


        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("张七", 18, 65d));
        list2.add(new Student("李二", 20, 50d));
        list2.add(new Student("王一", 15, 95d));
        list2.add(new Student("张八", 22, 70d));
        list2.add(new Student("张九", 18, 85d));
        list2.add(new Student("张十", 17, 30d));
        list2.add(new Student("张十二", 15, 30d));
        list2.add(new Student("张十三", 14, 30d));

        List<List<Student>> list3 = new ArrayList<>();
        list3.add(list);
        list3.add(list2);

//        1打印总共有多少姓张的学生的个数
        long num = Stream.concat(list.stream(), list2.stream()).filter((Student n) -> {
            return n.getName().startsWith("张");
        }).count();

        /*Stream<Student> stream1=list.stream().filter((Student n)->{
            return n.getName().startsWith("张");
        });
        Stream<Student> stream2=list2.stream().filter((Student n)->{
            return n.getName().startsWith("张");
        });*/
//        long num1=stream1.count();
//        long num2=stream2.count();

        System.out.println("姓张的总共有：" + num + "个");


//        2.先按年龄降序，再按成绩升序排序

        System.out.println("先按年龄降序，再按成绩升序排序");

        Stream.concat(list.stream(), list2.stream()).sorted((Student n, Student m) -> {
            if (n.getAge() == m.getAge()) {
                return (int) (m.getScore() - n.getScore());
            } else {
                return m.getAge() - n.getAge();
            }
        }).forEach((Student n) -> {
            System.out.println(n.getName() + "," + n.getAge() + "," + n.getScore());
        });

        /*list.stream().sorted((Student n,Student m)->{
            if (n.getAge()==m.getAge()){
                return (int)(m.getScore()-n.getScore());
            }else {
                return m.getAge()-n.getAge();
            }
        }).forEach((Student n) ->{
            System.out.println(n.getName()+","+n.getAge()+","+n.getScore());
        });

        System.out.println();

        list2.stream().sorted((Student n,Student m)->{
            if (n.getAge()==m.getAge()){
                return (int)(m.getScore()-n.getScore());
            }else {
                return m.getAge()-n.getAge();
            }
        }).forEach((Student n) ->{
            System.out.println(n.getName()+","+n.getAge()+","+n.getScore());
        });*/

        System.out.println();
//        3.打印2个班级中前3个姓张且年龄小于18岁的学生信息

        /*Stream.concat(list.stream(),list2.stream()).filter((Student n)->{
            return  n.getName().startsWith("张") && n.getAge()<18;
        }).limit(3).forEach((n)->{
            System.out.println(n.getName()+","+n.getAge()+","+n.getScore());
        });
*/
        System.out.println();

        List<Student> st = new ArrayList<>();
        for (int i = 0; i < list3.size(); i++) {
            List<Student> lis = list3.get(i);
            for (int j = 0; j < lis.size(); j++) {
                st = lis.stream().filter((Student n) -> {
                    return n.getName().startsWith("张") && n.getAge() < 18;
                }).collect(Collectors.toList());
            }
            Stream<Student> stream = st.stream().limit(3);
            System.out.println("第" + (i + 1) + "个班级中前3个姓张且年龄小于18岁的学生信息");
            stream.forEach((Student n) -> {
                System.out.println(n.getName() + "," + n.getAge() + "," + n.getScore());
            });
            System.out.println();
        }


    }

}
