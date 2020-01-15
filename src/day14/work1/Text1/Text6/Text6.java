package day14.work1.Text1.Text6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Text6 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("张三", 20), "湖南");
        map.put(new Student("张三", 20), "湖南23");
        map.put(new Student("李四", 25), "广东");
        map.put(new Student("王五", 23), "长沙");

        Set<Map.Entry<Student, String>> entry = map.entrySet();
        for (Map.Entry<Student, String> entry1 : entry) {
            Student stu = entry1.getKey();
            String str = entry1.getValue();
            System.out.println(stu + "," + str);
        }

        System.out.println();

        Set<Student> set = map.keySet();
        for (Student stu : set) {
            String value = map.get(stu);
            System.out.println(stu + "," + value);
        }
    }
}
